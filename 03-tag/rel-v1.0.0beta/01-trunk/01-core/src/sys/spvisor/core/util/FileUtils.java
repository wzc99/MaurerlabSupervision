package sys.spvisor.core.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author admin
 */
public final class FileUtils {
	/**
	 * private constructor method that make class can not be instantiation
	 */
	private FileUtils() {
		throw new Error("The class Cannot be instance !");
	}

	/**
	 * spring mvc files Upload method (transferTo method) MultipartFile use
	 * TransferTo method upload
	 *
	 * @param request
	 *            HttpServletRequest
	 * @param multipartFile
	 *            MultipartFile(spring)
	 * @param filePath
	 *            filePath example "/files/Upload"
	 * @return
	 */
	public static String FilesUpload_transferTo_spring(HttpServletRequest request, MultipartFile multipartFile,
			String filePath) {
		if (multipartFile != null) {
			// get files suffix
			String suffix = multipartFile.getOriginalFilename()
					.substring(multipartFile.getOriginalFilename().lastIndexOf("."));

			// filePath+fileName the complex file Name
			String serverPath = getServerPath(request, filePath);
			String relativePath = getRelativePath();
			checkDir(serverPath + relativePath);
			String result = relativePath + getUUIDName(suffix);
			String absolutePath = serverPath + result;
			try {
				// save file
				multipartFile.transferTo(new File(absolutePath));
				// return relative Path
				return filePath + result;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		} else
			return null;
	}

	/**
	 * spring mvc files Upload method (transferTo method) MultipartFile use
	 * TransferTo method upload
	 *
	 * @param request
	 *            HttpServletRequest
	 * @param multipartFile
	 *            MultipartFile(spring)
	 * @param filePath
	 *            filePath example "/files/Upload"
	 * @return
	 */
	public static String FilesUpload_transferTo_springOutProject(HttpServletRequest request,
			MultipartFile multipartFile, String filePath) {
		if (multipartFile != null) {
			// get files suffix
			String suffix = multipartFile.getOriginalFilename()
					.substring(multipartFile.getOriginalFilename().lastIndexOf("."));

			// filePath+fileName the complex file Name
			String serverPath = getServerPath(request, filePath);
			serverPath = serverPath.replace(File.separator + "console", File.separator);
			String relativePath = getRelativePath();
			checkDir(serverPath + relativePath);
			String result = relativePath + getUUIDName(suffix);
			String absolutePath = serverPath + result;
			try {
				// save file
				multipartFile.transferTo(new File(absolutePath));
				// return relative Path
				return filePath + result;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		} else
			return null;
	}

	public static String[] MaxFilesUpload_transferTo_spring(HttpServletRequest request, MultipartFile[] files,
			String filePath) {

		if (files != null) {
			String result[] = new String[files.length];
			for (int i = 0; i < files.length; i++) {
				result[i] = FilesUpload_transferTo_springOutProject(request, files[i], filePath);
			}

			return result;
		} else
			return null;
	}

	/**
	 * 流式上传文件
	 * 
	 * @param request
	 *            HttpServletRequest
	 * @param multipartFile
	 *            MultipartFile support CommonsMultipartFile file
	 * @param filePath
	 *            filePath example "/files/Upload"
	 * @return
	 */
	public static String FilesUpload_stream(HttpServletRequest request, MultipartFile multipartFile, String filePath) {
		if (multipartFile != null) {
			// get files suffix
			String suffix = multipartFile.getOriginalFilename()
					.substring(multipartFile.getOriginalFilename().lastIndexOf("."));
			String serverPath = getServerPath(request, filePath);
			String relativePath = getRelativePath();
			checkDir(serverPath + relativePath);
			String result = relativePath + getUUIDName(suffix);
			String absolutePath = serverPath + result;
			try {
				InputStream inputStream = multipartFile.getInputStream();
				FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
				byte buffer[] = new byte[4096]; // create a buffer
				long fileSize = multipartFile.getSize();
				if (fileSize <= buffer.length) {// if fileSize < buffer
					buffer = new byte[(int) fileSize];
				}
				int line = 0;
				while ((line = inputStream.read(buffer)) > 0) {
					fileOutputStream.write(buffer, 0, line);
				}
				fileOutputStream.close();
				inputStream.close();
				return filePath + result;
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			return null;
		return null;
	}

	/**
	 * @param request
	 *            HttpServletRequest
	 * @param response
	 *            HttpServletResponse
	 * @param filePath
	 *            example "/filesOut/Download/mst.txt"
	 * @return
	 */
	public static void FilesDownload_stream(HttpServletRequest request, HttpServletResponse response, String filePath) {
		// get server path (real path)
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
			response.addHeader("Content-Disposition",
					"attachment;filename=" + new String(filenames.replaceAll(" ", "").getBytes("utf-8"), "iso8859-1"));
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

	// -------------------------------------------------------------------------------
	// return server absolute path（real path）
	public static String getServerPath(HttpServletRequest request, String filePath) {
		String result = request.getSession().getServletContext().getRealPath(filePath);
		checkDir(result);
		return result;
	}

	// return a dir that named date of today ; example:20160912
	public static String getDataPath() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}

	// check if the path has exist if not create it
	public static void checkDir(String savePath) {
		File dir = new File(savePath);
		if (!dir.exists() || !dir.isDirectory()) {
			dir.mkdirs();
		}
	}

	// return an UUID Name parameter (suffix cover '.') example： ".jpg"、".txt"
	public static String getUUIDName(String suffix) {
		return UUID.randomUUID().toString() + suffix;// make new file name
	}

	// return server absolute path（real path） the style is “server absolute
	// path/DataPath/UUIDName”filePath example "/files/Upload"
	public static String getAndSetAbsolutePath(HttpServletRequest request, String filePath, String suffix) {
		String savePath = getServerPath(request, filePath) + File.separator + getDataPath() + File.separator;// example:F:/qixiao/files/Upload/20160912/
		checkDir(savePath);// check if the path has exist if not create it
		return savePath + getUUIDName(suffix);
	}

	public static String getRelativePath() {
		return File.separator + getDataPath() + File.separator;
	}

}