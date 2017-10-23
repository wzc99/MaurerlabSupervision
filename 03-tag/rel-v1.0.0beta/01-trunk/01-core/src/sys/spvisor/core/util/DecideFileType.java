package sys.spvisor.core.util;

//用来判断文件是否属于图片或者PDF
public class DecideFileType {
	/** 
	 * 判断文件是否为图片<br> 
	 * <br> 
	 * @param pInput 文件名<br> 
	 * @param pImgeFlag 判断具体文件类型<br> 
	 * @return 检查后的结果<br> 
	 * @throws Exception 
	 */  
	public static boolean isPicture(String fileName) throws Exception{  
	 // 文件名称为空的场合  
	 if(fileName.isEmpty()){  
	  // 返回不和合法  
	  return false;  
	 }  
	 // 获得文件后缀名  
	 String tmpName = fileName.substring(fileName.lastIndexOf(".") + 1,  
			 fileName.length());  
	 // 声明图片后缀名数组  
	 String imgeArray [][] = {  
	   {"bmp", "0"}, {"dib", "1"}, {"gif", "2"},  
	   {"jfif", "3"}, {"jpe", "4"}, {"jpeg", "5"},  
	   {"jpg", "6"}, {"png", "7"} ,{"tif", "8"},  
	   {"tiff", "9"}, {"ico", "10"}  
	 };  
	 // 遍历名称数组  
	 for(int i = 0; i<imgeArray.length;i++){  
	  // 判断单个类型文件的场合  
	  if(!fileName.isEmpty() && imgeArray [i][0].equals(tmpName.toLowerCase())){  
	   return true;  
	  }  
	    
	 }  
	 return false;  
	}  
	
	/** 
	 * 判断文件是否为PDF<br> 
	 * <br> 
	 * @param pInput 文件名<br> 
	 * @param pImgeFlag 判断具体文件类型<br> 
	 * @return 检查后的结果<br> 
	 * @throws Exception 
	 */  
	public static boolean isPDF(String fileName) throws Exception{  
	 // 文件名称为空的场合  
	 if(fileName.isEmpty()){  
	  // 返回不和合法  
	  return false;  
	 }  
	 // 获得文件后缀名  
	 String tmpName = fileName.substring(fileName.lastIndexOf(".") + 1,  
			 fileName.length());  
	
	 if(!tmpName.isEmpty()&&tmpName.toLowerCase().equalsIgnoreCase("pdf")) {
		 return true;
	 }
	 return false;  
	}  
}
