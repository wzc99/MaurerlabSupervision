package sys.spvisor.console.general;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class DocCreator {

	private Configuration configuration = null;

	public DocCreator() {
		configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
		configuration.setClassForTemplateLoading(getClass(), "/sys/spvisor/console/ftl");
	}
	
	//导出word文档
	public void downloadWord(HttpServletRequest request,HttpServletResponse response,
			Map<?, ?> map,String ftlName) throws IOException{
		Template template = configuration.getTemplate(ftlName+".ftl");
		File file = null;
		InputStream fiInputStream = null;
		ServletOutputStream outputStream = null;
		try{
			file = createDoc(map, template);
			fiInputStream = new FileInputStream(file);
			
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/msword");
			String fileName = ftlName+".doc";
			response.setHeader("Content-Disposition", "attachment;filename="
					.concat(String.valueOf(URLEncoder.encode(fileName, "UTF-8"))));
			outputStream = response.getOutputStream();
			byte[] buff = new byte[1024];
			int bytesToRead = -1;
			
			while((bytesToRead = fiInputStream.read(buff)) != -1){
				outputStream.write(buff, 0, bytesToRead);
			}
		} finally {
			if(fiInputStream != null) fiInputStream.close();
			if(outputStream != null) outputStream.close(); 
			if(file != null) file.delete();
		}
	}
	
	//将数据写入模板
	public File createDoc(Map<?, ?> dataMap,Template template){
		String name =  "sellPlan.doc";
		File f = new File(name); 
		Template t = template;
		try{
			Writer w = new OutputStreamWriter(new FileOutputStream(f), "utf-8");
			t.process(dataMap, w);
			w.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		return f;
	}

}