package sys.spvisor.core.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DatetimeUtil {

	public static String date2StringDate(Date date) {
		if (date == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}

	public static String utilDate2StringDate(java.util.Date date) {
		if (date == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(date);
	}

	public static String date2StringDatetime(Date date) {
		if (date == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(date);
	}

	public static String date2StringTime(Date date) {
		if (date == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		return df.format(date);
	}

	public static String timestamp2StringDate(Timestamp t) {
		if (t == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(t);
	}

	public static String timestamp2StringTime(Timestamp t) {
		if (t == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		return df.format(t);
	}

	public static String timestamp2StringDatetime(Timestamp t) {
		if (t == null) {
			return "";
		}

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(t);
	}

	public static Date string2Date(String str) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return new Date(df.parse(str).getTime());
	}

	public static Date string2Datetime(String str) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return new Date(df.parse(str).getTime());
	}

	public static Date string2Time(String str) throws ParseException {
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		return new Date(df.parse(str).getTime());
	}

	public static Timestamp string2Timestamp(String str) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date date = df.parse(str);
		String time = df.format(date);
		return Timestamp.valueOf(time);
	}

	// T+1 非工作日
	public static Date periodStartTime(Integer period) {
		Calendar time = Calendar.getInstance();
		int day = time.get(Calendar.DAY_OF_YEAR);
		time.set(Calendar.DAY_OF_YEAR, day + 1);
		time.set(Calendar.MONTH, time.get(Calendar.MONTH) + period - 1);
		return new Date(time.getTime().getTime());
	}

	public static Date periodEndTime(Integer period) {
		Calendar time = Calendar.getInstance();
		int day = time.get(Calendar.DAY_OF_YEAR);
		time.set(Calendar.DAY_OF_YEAR, day + 1);
		time.set(Calendar.MONTH, time.get(Calendar.MONTH) + period);
		return new Date(time.getTime().getTime());
	}

	public static String getCurrentDateTime(String formatType) {
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat(formatType);
		return sdf.format(date);
	}

	public static java.sql.Timestamp getCurrentTimestamp() throws ParseException {
		java.util.Date date = new java.util.Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date temp = df.parse(df.format(date));
		java.sql.Timestamp result = new java.sql.Timestamp(temp.getTime());
		// System.out.println(df.format(timestamp2Date(result)));
		return result;
	}

	public static java.util.Date timestamp2Date(java.sql.Timestamp timestamp) {
		java.util.Date temp = new java.util.Date(timestamp.getTime());
		return temp;
	}

	/**
	 * 返回两个日期之间的天数，每月为30天，每年为360天
	 * 
	 * @param start
	 *            开始日期
	 * @param end
	 *            结束日期
	 * @return 间隔的天数
	 */
	public static int getDateInterval(java.sql.Date start, java.sql.Date end) {
		GregorianCalendar startCal = new GregorianCalendar();
		GregorianCalendar endCal = new GregorianCalendar();
		startCal.setTime(start);
		endCal.setTime(end);
		int startYear = startCal.get(Calendar.YEAR);
		int endYear = endCal.get(Calendar.YEAR);
		int startMonth = startCal.get(Calendar.MONTH);
		int endMonth = endCal.get(Calendar.MONTH);
		int months = 0;
		if (startYear == endYear) {
			months = endMonth - startMonth;
		} else {
			months = 12 * (endYear - startYear) + endMonth - startMonth;// 两个日期相差几个月，即月份差
		}
		// months = months == 0 ? 0 : months - 1;
		int startDay = startCal.get(Calendar.DATE) == 31 ? 30 : startCal.get(Calendar.DATE);
		int endDay = endCal.get(Calendar.DATE) == 31 ? 30 : endCal.get(Calendar.DATE);
		int gap = months * 30 + endDay - startDay;
		return gap;
	}

	public static int dateDiff(String start, String end) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("zh", "cn"));
		try {
			long t1 = simpleDateFormat.parse(start).getTime();
			long t2 = simpleDateFormat.parse(end).getTime();
			int diff = (int) ((t2 - t1) / 1000);
			return diff;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static String dateStringMinner(String date1, String date2) {
		if (date1.compareTo(date2) > 0) {
			return date2;
		}
		return date1;
	}

	/**
	 * 取得当前日期是多少周
	 * 
	 * @param date
	 * @return
	 */
	public static int getWeekOfYear(java.util.Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.setTime(date);
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	/**
	 * 得到某一年周的总数
	 * 
	 * @param year
	 * @return
	 */
	public static int getMaxWeekNumOfYear(int year) {
		Calendar c = new GregorianCalendar();
		c.set(year, Calendar.DECEMBER, 31, 23, 59, 59);
		return getWeekOfYear(c.getTime());
	}

	/**
	 * 得到某年某周的第一天
	 * 
	 * @param year
	 * @param week
	 * @return
	 */
	public static java.util.Date getFirstDayOfWeek(int year, int week) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 1);
		Calendar cal = (GregorianCalendar) c.clone();
		cal.add(Calendar.DATE, week * 7);
		return getFirstDayOfWeek(cal.getTime());
	}

	/**
	 * 得到某年某周的最后一天
	 * 
	 * @param year
	 * @param week
	 * @return
	 */
	public static java.util.Date getLastDayOfWeek(int year, int week) {
		Calendar c = new GregorianCalendar();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 1);
		Calendar cal = (GregorianCalendar) c.clone();
		cal.add(Calendar.DATE, week * 7);
		return getLastDayOfWeek(cal.getTime());
	}

	/**
	 * 取得指定日期所在周的第一天
	 * 
	 * @param date
	 * @return
	 */
	public static java.util.Date getFirstDayOfWeek(java.util.Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek()); // Monday
		return c.getTime();
	}

	/**
	 * 取得指定日期所在周的最后一天
	 * 
	 * @param date
	 * @return
	 */
	public static java.util.Date getLastDayOfWeek(java.util.Date date) {
		Calendar c = new GregorianCalendar();
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, c.getFirstDayOfWeek() + 6); // Sunday
		return c.getTime();
	}

	public static Date util2SqlDate(java.util.Date date) {
		try {
			return string2Date(utilDate2StringDate(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	// public static void main(String[] args) throws Exception {
	// DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	// System.out.println(df.format(getFirstDayOfWeek(2017,2)));
	// System.out.println(df.format(getLastDayOfWeek(2017,2)));
	// }

	/*
	 * public static void main(String[] args) throws Exception { //
	 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //
	 * System.out.println(DatetimeUtil.dateDiff("2014-07-31 18:59:00",
	 * "2014-08-03 00:00:00")); SimpleDateFormat sdf = new
	 * SimpleDateFormat("yyyy-MM-dd"); java.util.Date date1 =
	 * sdf.parse("2014-2-1");
	 * 
	 * java.util.Date date2 = sdf.parse("2015-3-14"); long gap =
	 * DatetimeUtil.getDateInterval(date1, date2); System.out.println("\n相差" +
	 * gap + "天"); }
	 */
}
