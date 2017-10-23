package sys.spvisor.core.util;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class JournalFileUtil {

	public static synchronized File createJournalFileName(HttpServletRequest request, MultipartFile file) {
		String path = request.getSession().getServletContext().getRealPath("upload");
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		// 生成唯一编号
		String tempId = System.currentTimeMillis() + "_" + Long.toString((long) (Math.random() * Long.MAX_VALUE), 36);
		String fileName = tempId + suffix;
		System.out.println(path);
		File targetFile = new File(path, fileName);
		if (!targetFile.exists()) {
			targetFile.mkdirs();
		}

		return targetFile;
	}

}
