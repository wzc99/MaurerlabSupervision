package sys.file.common;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public class AutoCreateFileName {
	public static synchronized File createFileName(HttpServletRequest request, MultipartFile file, int proId) {
		String path = request.getSession().getServletContext().getRealPath("upload/"+proId);
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		// 生成唯一编号
		String tempId = System.currentTimeMillis() + "_" + Long.toString((long) (Math.random() * Long.MAX_VALUE), 36);
		String fileName = tempId + suffix;
		System.out.println(path);
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 

		return targetFile;
	}
	
	public static synchronized File updateFileName(HttpServletRequest request, MultipartFile file,String fileName,int proId) {
		String path = request.getSession().getServletContext().getRealPath("upload/"+proId);
		/*String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		// 生成唯一编号
		String tempId = System.currentTimeMillis() + "_" + Long.toString((long) (Math.random() * Long.MAX_VALUE), 36);
		String fileName = tempId + suffix;*/
		System.out.println(path);
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

        //保存  
        try {  
            file.transferTo(targetFile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } 

		return targetFile;
	}
	
	/**
	 * 文件下载 日志文件专用
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param filePath example "/filesOut/Download/mst.txt"
     * @return
     */
    public static synchronized void JournalFilesDownload(HttpServletRequest request, HttpServletResponse response, String filePath) {
        //get server path (real path)
        String realPath = request.getSession().getServletContext().getRealPath(filePath);
        realPath = realPath.replace(File.separator+"console", "");
        File file = new File(realPath);
        String filenames = file.getName();
        try {
        	InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            response.reset();
            // 先去掉文件名称中的空格,然后转换编码格式为utf-8,保证不出现乱码,这个文件名称用于浏览器的下载框中自动显示的文件名
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filenames.replaceAll(" ", "").getBytes("utf-8"), "iso8859-1"));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream os = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            os.write(buffer);// 输出文件
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	/**
	 * 文件下载
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param filePath example "/filesOut/Download/mst.txt"
     * @return
     */
    public static synchronized void FilesDownload(HttpServletRequest request, HttpServletResponse response, String filePath) {
        //get server path (real path)
        String realPath = request.getSession().getServletContext().getRealPath(filePath);
        File file = new File(realPath);
        String filenames = file.getName();
        try {
        	InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            response.reset();
            // 先去掉文件名称中的空格,然后转换编码格式为utf-8,保证不出现乱码,这个文件名称用于浏览器的下载框中自动显示的文件名
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filenames.replaceAll(" ", "").getBytes("utf-8"), "iso8859-1"));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream os = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            os.write(buffer);// 输出文件
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /**
	 * 文件下载到指定路径，并
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param filePath example "/filesOut/Download/mst.txt"
     * @return
     */
   /* public static synchronized void FilesDownloadToDir(HttpServletRequest request, HttpServletResponse response, String filePath) {
        //get server path (real path)
        String realPath = request.getSession().getServletContext().getRealPath(filePath);
        File file = new File(realPath);
        String filenames = file.getName();
        InputStream inputStream;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            response.reset();
            // 先去掉文件名称中的空格,然后转换编码格式为utf-8,保证不出现乱码,这个文件名称用于浏览器的下载框中自动显示的文件名
            response.addHeader("Content-Disposition", "attachment;filename=" + new String(filenames.replaceAll(" ", "").getBytes("utf-8"), "iso8859-1"));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream os = new BufferedOutputStream(response.getOutputStream());
            response.setContentType("application/octet-stream");
            os.write(buffer);// 输出文件
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
