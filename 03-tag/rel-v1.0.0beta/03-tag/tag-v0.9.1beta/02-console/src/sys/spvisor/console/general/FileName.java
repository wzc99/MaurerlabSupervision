package sys.spvisor.console.general;

public class FileName {
	public String getFilesuffixs(String name) {
		
		String[] suffixs = name.split("\\.");
		String format = suffixs[suffixs.length-1];
		System.out.println();
		String formatName = "";
		if(format.equals("doc") || format.equals("docx")) {
			formatName = "application/msword";
		} else if(format.equals("pdf") ) {
			formatName = "application/pdf";
		} else if(format.equals("ppt") || format.equals("pptx")) {
			formatName = "appication/powerpoint";
		} else if (format.equals("zip")) {
			formatName = "application/zip";
		} else if(format.equals("gif")) {
			formatName = "image/gif";
		} else if(format.equals("jpeg") || format.equals("jpg") || format.equals("jpe")) {
			formatName = "image/jpeg";
		} else if(format.equals("png")) {
			formatName = "image/png";
		}else if(format.equals("xls") || format.equals("xlsx")) {
			formatName = "application/vnd.ms-excel";
		}
		System.out.println(formatName);
		return formatName;
		
	}
}
