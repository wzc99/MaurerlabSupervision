package sys.spvisor.core.util;

import java.io.File;

public class SystemConstants {
	// 模版路径
	public static final String tempFilesPath = File.separator + "files" + File.separator + "templates";
	// 日志临时文件路径
	public static final String journaleTempFilesPath = File.separator + "files" + File.separator + "journal"
			+ File.separator ;
	// 报表路径
	public static final String journalsPath = File.separator + "upload" + File.separator + "journals";
	// 物资清单生成存储路径
	public static final String materialListFilesPath = File.separator + "files" + File.separator
			+ "material_list_files";
	// 签名文件存储路径
	public static final String userSignaturePath = File.separator + "files" + File.separator + "signature";
}
