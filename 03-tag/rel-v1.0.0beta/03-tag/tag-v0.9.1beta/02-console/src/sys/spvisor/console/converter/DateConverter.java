package sys.spvisor.console.converter;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		if(source.equals(""))
			return null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
		dateFormat.setLenient(false);    
		try {    
			Date result = new Date(dateFormat.parse(source).getTime());
			System.out.println(result);
			return  result;
		} catch (ParseException e) {    
			//e.printStackTrace();    
		}           
		return null; 
	}

}
