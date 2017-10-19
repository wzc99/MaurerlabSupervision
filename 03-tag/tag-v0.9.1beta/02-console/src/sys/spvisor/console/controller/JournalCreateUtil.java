package sys.spvisor.console.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.xmlbeans.XmlCursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sys.spvisor.core.dao.project.TProjectMapper;
import sys.spvisor.core.entity.journal.JournalModel;
import sys.spvisor.core.entity.journal.LookDetail;
import sys.spvisor.core.entity.journal.TJournal;
import sys.spvisor.core.entity.project.TProject;
import sys.spvisor.core.entity.question.ProblemResult;
import sys.spvisor.core.result.process.Table1;
import sys.spvisor.core.result.process.Table2;
import sys.spvisor.core.result.process.Table22;
import sys.spvisor.core.result.process.Table3;
import sys.spvisor.core.result.process.Table33;
import sys.spvisor.core.service.journal.JournalService;
import sys.spvisor.core.service.project.ProblemService;
import sys.spvisor.core.util.DatetimeUtil;
import sys.spvisor.core.util.Enumerations;
import sys.spvisor.core.util.FileUtils;
import sys.spvisor.core.util.OfficeUtils;
import sys.spvisor.core.util.SystemConstants;

@Service
public class JournalCreateUtil {

	@Autowired
	private JournalService jService;

	@Autowired
	private ScheduleController sController;

	@Autowired
	private TProjectMapper proDao;

	@Autowired
	private ProblemService problemService;

	public TJournal initJournal(int type, int handler, int status, String path, int proId, String proName, Date jTime,
			int week, int weekYear, Timestamp first, Timestamp last) {
		TJournal temp = new TJournal();
		temp.setFile(path);
		temp.setType(type);
		temp.setHandler(handler);
		temp.setPid(proId);
		temp.setPname(proName);
		temp.setStatus(status);
		temp.setFirstTime(first);
		temp.setLastTime(last);
		if (type == 0) {
			temp.setjTime(jTime);
		} else {
			temp.setYearInt(weekYear);
			temp.setWeek(week);
		}

		return temp;
	}

	public int createDailyJournal(int handler, JournalModel model, String templatePath, String picParentPath,
			String journalParentPath, int processType, int journalId) throws Exception {
		int result = 0;
		int proId = model.getProId();
		Date date = DatetimeUtil.string2Date(DatetimeUtil.utilDate2StringDate(model.getDailyDate()));
		List<Table1> tab1 = sController.dailyTable1(proId, date);
		List<Table2> tab2 = sController.dailyTable2(proId, date);
		List<Table3> tab3 = sController.dailyTable3(proId, date);
		TProject project = proDao.selectByPrimaryKey(proId);
		List<ProblemResult> problems = problemService.getDailyQuestion(date, proId);
		templatePath = templatePath.replace(File.separator + "console", File.separator);

		String tempTemplatePath = createWordByModel(tab2.size(), tab3.size(), templatePath, project, 0);
		String path = setData2Word(tempTemplatePath, journalParentPath, picParentPath, tab1, tab2, tab3, model,
				project.getProNum(), project, problems);
		if (processType == 0) {
			jService.insertJournal(initJournal(0, handler, 0, path, proId, project.getProjectName(),
					DatetimeUtil.string2Date(DatetimeUtil.utilDate2StringDate(model.getDailyDate())), 0, 0,
					DatetimeUtil.getCurrentTimestamp(), DatetimeUtil.getCurrentTimestamp()));
		} else {
			TJournal temp = new TJournal();
			temp.setId(journalId);
			temp.setFile(path);
			temp.setStatus(0);
			temp.setHandler(handler);
			temp.setLastTime(DatetimeUtil.getCurrentTimestamp());
			jService.updateJournal(temp, handler);
		}

		return result;
	}

	public int createWeeklyJournal(int handler, JournalModel model, String templatePath, String picParentPath,
			String journalParentPath, int processType, int journalId) throws Exception {
		int result = 0;
		int proId = model.getProId();
		java.util.Date tempStart = DatetimeUtil.getFirstDayOfWeek(model.getYearDate(), model.getWeekDate());
		java.util.Date tempEnd = DatetimeUtil.getLastDayOfWeek(model.getYearDate(), model.getWeekDate());
		Date start = DatetimeUtil.util2SqlDate(tempStart);
		Date end = DatetimeUtil.util2SqlDate(tempEnd);
		List<Table1> tab1 = sController.weeklyTable1(proId, start, end);
		List<Table2> tab2 = sController.weeklyTable2(proId, start, end);
		List<Table3> tab3 = sController.weeklyTable3(proId, start, end);
		TProject project = proDao.selectByPrimaryKey(proId);
		List<ProblemResult> problems = problemService.getWeekQuestion(start, end, proId);
		templatePath = templatePath.replace(File.separator + "console", File.separator);

		String tempTemplatePath = createWordByModel(tab2.size(), tab3.size(), templatePath, project, 1);

		String path = setData2Word(tempTemplatePath, journalParentPath, picParentPath, tab1, tab2, tab3, model,
				project.getProNum(), project, problems);

		if (processType == 0) {
			jService.insertJournal(initJournal(1, handler, 0, path, proId, project.getProjectName(), null,
					model.getWeekDate(), model.getYearDate(), DatetimeUtil.getCurrentTimestamp(),
					DatetimeUtil.getCurrentTimestamp()));
		} else {
			TJournal temp = new TJournal();
			temp.setId(journalId);
			temp.setFile(path);
			temp.setStatus(0);
			temp.setHandler(handler);
			temp.setLastTime(DatetimeUtil.getCurrentTimestamp());
			jService.updateJournal(temp, handler);
		}

		return result;
	}

	private String setData2Word(String templatePath, String savepath, String picPath, List<Table1> tab1,
			List<Table2> tab2, List<Table3> tab3, JournalModel model, String orderNo, TProject project,
			List<ProblemResult> problems) throws InvalidFormatException, IOException {
		String result = null;
		InputStream is = null;
		XWPFDocument doc = null;
		is = new FileInputStream(templatePath);
		doc = new XWPFDocument(is);
		List<XWPFTable> tabs = doc.getTables();

		/** table1 start **/
		setTable1Date(tab1, tabs.get(2));
		/** table1 end **/

		/** table2 start **/
		initTab2ByData(tab2, tabs);
		setTable2Date(tab2, tabs, orderNo);
		/** table2 end **/

		/** table3 start **/
		setTable3Date(tab3, tabs, tab2.size(), orderNo);
		/** table3 end **/

		/** picTable start **/
		setPicTableData(model, tabs.get(3 + tab2.size() + tab3.size()), picPath);
		/** picTable end **/

		setPlainData(doc, project, model, problems);

		FileOutputStream out;
		String uuid = FileUtils.getUUIDName(".docx");
		out = new FileOutputStream(savepath + File.separator + uuid);
		result = SystemConstants.journalsPath + File.separator + uuid;
		doc.write(out);
		doc.close();
		out.close();
		is.close();

		return result;
	}

	private int setPicTableData(JournalModel model, XWPFTable table, String path)
			throws InvalidFormatException, IOException {
		path = path.replace(File.separator + "console", "");
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		int size = model.getPicPath().length % 2 == 0 ? model.getPicPath().length / 2
				: model.getPicPath().length / 2 + 1;
		boolean tag = model.getPicPath().length % 2 == 0 ? true : false;

		for (int i = 0; i < size; i++) {
			XWPFTableRow row1 = null;
			XWPFTableRow row2 = null;
			if (i > 0) {
				row1 = table.createRow();
				// row1.addNewTableCell();
				row2 = table.createRow();
				// row2.addNewTableCell();
			} else {
				row1 = table.getRow(0);
				row2 = table.getRow(1);
			}
			InputStream ip1 = new FileInputStream(path + File.separator + model.getPicPath()[i * 2]);
			XWPFRun picRun1 = row1.getCell(0).getParagraphArray(0).createRun();
			picRun1.addPicture(ip1, Document.PICTURE_TYPE_PNG, "", Units.toEMU(230), Units.toEMU(170));
			ip1.close();
			row2.getCell(0).setText(model.getPicDes()[i * 2]);
			if (i + 1 != size || tag) {
				InputStream ip2 = new FileInputStream(path + File.separator + model.getPicPath()[i * 2 + 1]);
				XWPFRun picRun2 = row1.getCell(1).getParagraphArray(0).createRun();
				picRun2.addPicture(ip2, Document.PICTURE_TYPE_PNG, "", Units.toEMU(230), Units.toEMU(170));
				ip2.close();
				row2.getCell(1).setText(model.getPicDes()[i * 2 + 1]);
			}
		}

		return result;
	}

	private int setPlainData(XWPFDocument doc, TProject project, JournalModel model, List<ProblemResult> problems) {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();

		List<XWPFParagraph> paras = doc.getParagraphs();
		XWPFParagraph lookPara = null;
		XWPFParagraph problemPara = null;
		for (XWPFParagraph para : paras) {
			if (para.getText().contains("${project}")) {
				OfficeUtils.replaceText(para, "${project}", project.getProjectName());
			}
			if (para.getText().contains("${factory}")) {
				OfficeUtils.replaceText(para, "${factory}", project.getProFactory());
			}
			if (para.getText().contains("${time}")) {
				String[] te = model.getDailyDate().toString().split("-");
				//System.out.println(model.getDailyDate().toString());
				OfficeUtils.replaceText(para, "${time}", te.length >= 1 ? te[0] + "年"
						: "" + (te.length >= 2 ? te[1] + "月" : "") + (te.length >= 3 ? te[2] + "日" : ""));
			}

			if (para.getText().contains("order")) {
				OfficeUtils.replaceText(para, "order", project.getProNum());
			}

			if (para.getText().contains("look")) {
				lookPara = para;
			}

			if (para.getText().contains("problem")) {
				problemPara = para;
			}
			if (para.getText().contains("${HSE}")) {
				OfficeUtils.replaceText(para, "${HSE}", model.getHseContent());
			}

		}

		// 初始化见证
		List<LookDetail> list = model.getList();
		for (int i = 0; i < list.size(); i++) {
			doc.insertNewParagraph(lookPara.getCTP().newCursor()).createRun()
					.setText(i + 1 + ". " + list.get(i).getTitle());
			doc.insertNewParagraph(lookPara.getCTP().newCursor()).createRun().setText(list.get(i).getContent());
		}
		// 初始化问题
		for (int i = 0; i < problems.size(); i++) {
			doc.insertNewParagraph(problemPara.getCTP().newCursor()).createRun()
					.setText(i + 1 + ". " + problems.get(i).getQuesNoSuitBasis());
			doc.insertNewParagraph(problemPara.getCTP().newCursor()).createRun()
					.setText(problems.get(i).getQuesDescription());
		}
		OfficeUtils.replaceText(lookPara, "look", "");
		OfficeUtils.replaceText(problemPara, "problem", "");
		return result;
	}

	private int setTable1Date(List<Table1> list, XWPFTable table) {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		try {
			for (int i = 0; i < list.size(); i++) {
				Table1 t1 = list.get(i);
				XWPFTableRow row = table.createRow();
				row.getCell(0).setText(i + 1 + "");
				System.out.print(row.getTableCells().size() + "ssssssss");

				row.getCell(1).setText(t1.getProductName());
				row.getCell(2).setText(t1.getProductNorm());
				row.getCell(3).setText(t1.getOrderTotal() + "");
				row.getCell(4).setText(t1.getCompleteRateToday() + "");
				row.getCell(5).setText(t1.getCompleteRateTotal() + "" + t1.getUnit());
				row.getCell(6).setText(DatetimeUtil.date2StringDate(t1.getPromiseDate()));
				row.getCell(7).setText(DatetimeUtil.date2StringDate(t1.getPlanDate()));
			}
			result = Enumerations.ServiceReturnCode.操作成功.getCode();
		} catch (Exception e) {
			result = Enumerations.ServiceReturnCode.出错或异常.getCode();
			e.printStackTrace();
		}

		return result;
	}

	private int setTable2Date(List<Table2> tab2, List<XWPFTable> table, String orderNo) {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		try {
			for (int i = 0; i < tab2.size(); i++) {
				// 第i 个表

				Table2 tempData = tab2.get(i);
				XWPFTable temp = table.get(i + 3);
				temp.getRow(0).getCell(0).setText("表2 生产进度明细表(" + orderNo + "/        )");
				List<Table22> rows = tempData.getRows();
				for (int z = 0; z < rows.size(); z++) {
					// 第i行
					XWPFTableRow row = temp.createRow();
					System.out.println(row.getTableCells().size() + "size");
					Table22 rowCell = rows.get(z);
					row.getCell(0).setText(z + 1 + "");
					row.addNewTableCell();
					row.getCell(1).setText(rowCell.getProductName());
					row.addNewTableCell();
					row.getCell(2).setText(rowCell.getProductNorm());
					row.addNewTableCell();
					row.getCell(3).setText(rowCell.getOrderTotal() + " " + rowCell.getUnit());
					for (int j = 0; j < rowCell.getProcedureValue().size(); j++) {
						row.addNewTableCell();
						row.getCell(j + 4)
								.setText(rowCell.getProcedureValue().get(j).getDay() + " "
										+ rowCell.getProcedureValue().get(j).getUnit() + " "
										+ rowCell.getProcedureValue().get(j).getSumUp());
					}
					if (rowCell.getProcedureValue().size() < 5) {
						for (int j = 0; j < 5 - rowCell.getProcedureValue().size(); j++) {
							row.addNewTableCell();
						}
					}

				}

			}
			result = Enumerations.ServiceReturnCode.操作成功.getCode();
		} catch (Exception e) {
			result = Enumerations.ServiceReturnCode.出错或异常.getCode();
			e.printStackTrace();
		}

		return result;
	}

	private int setTable3Date(List<Table3> tab3, List<XWPFTable> table, int start, String orderNo) {
		int result = Enumerations.ServiceReturnCode.出错或异常.getCode();
		try {
			for (int i = 0; i < tab3.size(); i++) {
				XWPFTable temp = table.get(3 + start + i);
				temp.getRow(0).getCell(0).setText("表3 生产进度明细表(" + orderNo + "/        )");
				Table3 tempData = tab3.get(i);
				// temp.getRow(0).getCell(0).setText("表3 生产进度明细表（"+11+"/ )");
				temp.getRow(1).getCell(0).setText(tempData.getProductName() + " " + tempData.getProductNorm() + "(合同数量:"
						+ tempData.getOrderTotal() + tempData.getUnit() + ")");
				for (int j = 0; j < tempData.getProcedure().size(); j++) {
					XWPFTableRow row = temp.createRow();
					Table33 tab33 = tempData.getProcedure().get(j);
					row.getCell(0).setText(tab33.getProcedureName());
					row.addNewTableCell();
					row.getCell(1).setText(tab33.getZhiDay());
					row.addNewTableCell();
					row.getCell(2).setText(tab33.getMiDay());
					row.addNewTableCell();
					row.getCell(3).setText(tab33.getDunDay());
					row.addNewTableCell();
					row.getCell(4).setText(tab33.getZhiSumUp());
					row.addNewTableCell();
					row.getCell(5).setText(tab33.getMiSumUp());
					row.addNewTableCell();
					row.getCell(6).setText(tab33.getDunSumUp());

				}

			}

			result = Enumerations.ServiceReturnCode.操作成功.getCode();
		} catch (Exception e) {
			result = Enumerations.ServiceReturnCode.出错或异常.getCode();
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * 生成中间模版 并简单初始化
	 * 
	 * @param tab2
	 * @param tab3
	 * @param path
	 * @param project
	 * @param type
	 *            0:day 1:week
	 * @return
	 * @throws IOException
	 */
	public String createWordByModel(int tab2, int tab3, String path, TProject project, int type) throws IOException {
		String result = null;
		InputStream is = null;
		XWPFDocument doc = null;
		InputStream istab23 = null;
		XWPFDocument tab23 = null;

		if (type == 0) {
			is = new FileInputStream(path + File.separator + "dailyJournal.docx");
		} else {
			is = new FileInputStream(path + File.separator + "weeklyJournal.docx");
		}
		if (is == null)
			return result;
		istab23 = new FileInputStream(path + File.separator + "table23.docx");
		if (is == null)
			return result;
		doc = new XWPFDocument(is);
		tab23 = new XWPFDocument(istab23);

		// 获取表2 3 的位置标示
		List<XWPFParagraph> paras = doc.getParagraphs();
		XWPFParagraph tabPara = null;
		List<XWPFTable> tabs = tab23.getTables();
		for (XWPFParagraph para : paras) {
			if (para.getText().contains("${tab23}")) {
				tabPara = para;
			}

		}

		// 开始两个表的数据填充
		XWPFTable tab0 = doc.getTables().get(0);
		tab0.getRow(0).getCell(1).setText(project.getProjectName());
		tab0.getRow(1).getCell(1).setText(project.getProFactory());

		XWPFTable tab1 = doc.getTables().get(1);
		tab1.getRow(3).getCell(1).setText("西安摩尔驻" + project.getProFactory() + "监理组");

		// 初始化表2 表3
		XWPFTable t2 = tabs.get(0);
		XWPFTable t3 = tabs.get(1);
		t3.getRow(3).getCell(1).setText(type == 0 ? "本日" : "本周");
		int tabNum = 3;
		if (tabPara != null) {
			for (int i = 0; i < tab2; i++) {
				doc.insertNewParagraph(tabPara.getCTP().newCursor());
				XmlCursor cs = tabPara.getCTP().newCursor();
				doc.insertNewTbl(cs);
				doc.setTable(tabNum++, t2);
			}
			doc.insertNewParagraph(tabPara.getCTP().newCursor());
			for (int i = 0; i < tab3; i++) {
				doc.insertNewParagraph(tabPara.getCTP().newCursor());
				XmlCursor cs = tabPara.getCTP().newCursor();
				doc.insertNewTbl(cs);
				doc.setTable(tabNum++, t3);
			}
			doc.insertNewParagraph(tabPara.getCTP().newCursor());
			OfficeUtils.replaceText(tabPara, "${tab23}", "");
		}

		FileOutputStream out = null;
		result = path + File.separator + FileUtils.getUUIDName(".docx");
		out = new FileOutputStream(result);
		doc.write(out);
		// 关闭文件
		doc.close();
		tab23.close();
		// 关闭流
		out.close();
		istab23.close();
		is.close();

		return result;
	}

	public void initTab2ByData(List<Table2> tab2, List<XWPFTable> table) {

		for (int i = 0; i < tab2.size(); i++) {
			XWPFTable temp = table.get(i + 3);
			Table2 tempData = tab2.get(i);
			for (int j = 0; j < tempData.getProcedureName().size(); j++) {
				if (j > 5) {
					addTable2Col(temp);
				}
				temp.getRow(2).getCell(j + 4).setText(tempData.getProcedureName().get(j).trim());
			}
		}
	}

	public static void addTable2Col(XWPFTable t2) {

		for (int i = 0; i < t2.getRows().size(); i++) {
			XWPFTableRow row = t2.getRow(i);
			row.addNewTableCell();
		}
		OfficeUtils.mergeCellsHorizontal(t2, 0, t2.getRow(0).getTableCells().size() - 2,
				t2.getRow(0).getTableCells().size() - 1);
		OfficeUtils.mergeCellsHorizontal(t2, 1, t2.getRow(1).getTableCells().size() - 2,
				t2.getRow(1).getTableCells().size() - 1);

	}

}
