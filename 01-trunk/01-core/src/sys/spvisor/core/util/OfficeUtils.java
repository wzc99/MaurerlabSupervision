package sys.spvisor.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import com.sun.star.io.ConnectException;
import com.sun.star.io.IOException;

import sys.spvisor.core.entity.project.TFileForm;
import sys.spvisor.core.entity.project.TGoodsLists;
import sys.spvisor.core.entity.work.TQualityCertificate;
import sys.spvisor.core.entity.work.TQualityReview;

public class OfficeUtils {

	/**
	 * @author admin 生成物资清单
	 * @param request
	 * @param response
	 * @return 返回生成文件的存储地址 待协商考虑地址
	 */

	public static TFileForm createMaterialList(HttpServletRequest request, HttpServletResponse response,List<TGoodsLists> list,int proId,String userName,long userId) {
		//String metrialListPath = FileUtils.getAndSetAbsolutePath(request, SystemConstants.materialListFilesPath,
				//".docx");
		String metrialListPath = request.getSession().getServletContext().getRealPath("upload/"+proId+"/material_list.docx");
		File fileDir = new File(request.getSession().getServletContext().getRealPath("upload/"+proId));
		
		if (!fileDir.exists()) {    fileDir.mkdirs();    }
		System.out.print(metrialListPath);
		String tempFilePath = FileUtils.getServerPath(request, SystemConstants.tempFilesPath).replace(File.separator + "console", File.separator)
				+ "\\t1_material_list.docx";    
		System.out.println(tempFilePath);

		// String path = System.getProperty("user.dir");
		// System.out.println(path);
		// String file = "/t1_material_list.docx";
		//
		// String tempFilePath = path + file;
		InputStream is = null;
		XWPFDocument doc = null;
		try {
			is = new FileInputStream(tempFilePath);
			doc = new XWPFDocument(is);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*if (doc == null) {

			return null;
		}*/
		// 获取文档中所有的表格
		List<XWPFTable> tables = doc.getTables();
		XWPFTable table = tables.get(0);

		for (int i = 0; i < list.size(); i++) {
			TGoodsLists temp = list.get(i);
			XWPFTableRow row = table.createRow();
			row.getCell(0).setText((i + 1) + "");
			row.getCell(1).setText(temp.getGoodType());
			row.getCell(2).setText(temp.getGoodName());
			row.getCell(3).setText(temp.getGoodSpecifications());
			row.getCell(4).setText(temp.getGoodOrderNum() + "");
			row.getCell(5).setText(temp.getGoodUnit());
			row.getCell(6).setText(temp.getGoodNote());

			for (XWPFTableCell cell : row.getTableCells()) {
				cell.getParagraphs().get(0).setAlignment(ParagraphAlignment.CENTER);
			}
		}

		FileOutputStream out;
		try {
			out = new FileOutputStream(metrialListPath);

			doc.write(out);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.close();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//return metrialListPath.substring(metrialListPath.indexOf("console")+7);
		TFileForm tPlanForm = new TFileForm();
		
		tPlanForm.setFileFormFilename("material_list.docx");
		/*tPlanForm.setFileFormContent(mf.getBytes());*/
		tPlanForm.setFileFormName("物资清单");
		tPlanForm.setFileFormPeople(userName);
		tPlanForm.setFileFormUserId((int)userId);
		tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
		tPlanForm.setFileFormProjectId(proId);
		tPlanForm.setFileFormCurrentStatus("D");
		tPlanForm.setFileFormCurrentStatusNum(0);
		tPlanForm.setFileFormNotpassTimes(0);
		tPlanForm.setFileFormType("物资清单");
		//设置存放的服务器路径
		tPlanForm.setFileFormPath("material_list.docx");
		return tPlanForm;
		//download(HttpServletResponse response, HttpServletRequest request,int type,int fileId)
		//AutoCreateFileName.FilesDownload(request, response,"/upload/"+proId+"/material_list.docx");
	}

	/**
	 * @author admin 生成原材料质量说明书
	 * @param request
	 * @param response
	 * @return 返回生成文件的存储地址 待协商考虑地址
	 */

	public static TFileForm createQualityCertificate(HttpServletRequest request, HttpServletResponse response,List<TQualityCertificate> list,int proId,String userName,long userId) {
		//String metrialListPath = FileUtils.getAndSetAbsolutePath(request, SystemConstants.materialListFilesPath,
				//".docx");
		String metrialListPath = request.getSession().getServletContext().getRealPath("upload/"+proId+"/checkrecord.docx");
		File fileDir = new File(request.getSession().getServletContext().getRealPath("upload/"+proId));
		
		if (!fileDir.exists()) {    fileDir.mkdirs();    }
		System.out.print(metrialListPath);
		String tempFilePath = FileUtils.getServerPath(request, SystemConstants.tempFilesPath).replace(File.separator + "console", File.separator)
				+ "\\checkrecord.docx";    
		System.out.println(tempFilePath);

		// String path = System.getProperty("user.dir");
		// System.out.println(path);
		// String file = "/t1_material_list.docx";
		//
		// String tempFilePath = path + file;
		InputStream is = null;
		XWPFDocument doc = null;
		try {
			is = new FileInputStream(tempFilePath);
			doc = new XWPFDocument(is);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*if (doc == null) {

			return null;
		}*/
		// 获取文档中所有的表格
		List<XWPFTable> tables = doc.getTables();
		XWPFTable table = tables.get(0);

		for (int i = 0; i < list.size(); i++) {
			TQualityCertificate temp = list.get(i);
			XWPFTableRow row = table.createRow();
			row.getCell(0).setText((i + 1) + "");
			row.getCell(1).setText(temp.getMaterialName());
			row.getCell(2).setText(temp.getSpecifications());
			row.getCell(3).setText(temp.getMaterialNum());
			row.getCell(4).setText(temp.getCheckResult());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = formatter.format(temp.getCheckDate());
			row.getCell(5).setText(dateString);

			for (XWPFTableCell cell : row.getTableCells()) {
				cell.getParagraphs().get(0).setAlignment(ParagraphAlignment.CENTER);
			}
		}

		FileOutputStream out;
		try {
			out = new FileOutputStream(metrialListPath);

			doc.write(out);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.close();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//return metrialListPath.substring(metrialListPath.indexOf("console")+7);
		TFileForm tPlanForm = new TFileForm();
		
		tPlanForm.setFileFormFilename("checkrecord.docx");
		/*tPlanForm.setFileFormContent(mf.getBytes());*/
		tPlanForm.setFileFormName("质量证明书");
		tPlanForm.setFileFormPeople(userName);
		tPlanForm.setFileFormUserId((int)userId);
		tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
		tPlanForm.setFileFormProjectId(proId);
		tPlanForm.setFileFormCurrentStatus("D");
		tPlanForm.setFileFormCurrentStatusNum(0);
		tPlanForm.setFileFormNotpassTimes(0);
		tPlanForm.setFileFormType("质量证明书");
		//设置存放的服务器路径
		tPlanForm.setFileFormPath("checkrecord.docx");
		return tPlanForm;
		//download(HttpServletResponse response, HttpServletRequest request,int type,int fileId)
		//AutoCreateFileName.FilesDownload(request, response,"/upload/"+proId+"/material_list.docx");
	}
	
	/**
	 * @author admin 生成原材料审核书
	 * @param request
	 * @param response
	 * @return 返回生成文件的存储地址 待协商考虑地址
	 */

	public static TFileForm createQualityReview(HttpServletRequest request, HttpServletResponse response,List<TQualityReview> list,int proId,String userName,long userId) {
		//String metrialListPath = FileUtils.getAndSetAbsolutePath(request, SystemConstants.materialListFilesPath,
				//".docx");
		String metrialListPath = request.getSession().getServletContext().getRealPath("upload/"+proId+"/checkreview.docx");
		File fileDir = new File(request.getSession().getServletContext().getRealPath("upload/"+proId));
		
		if (!fileDir.exists()) {    fileDir.mkdirs();    }
		System.out.print(metrialListPath);
		String tempFilePath = FileUtils.getServerPath(request, SystemConstants.tempFilesPath).replace(File.separator + "console", File.separator)
				+ "\\checkreview.docx";    
		System.out.println(tempFilePath);

		// String path = System.getProperty("user.dir");
		// System.out.println(path);
		// String file = "/t1_material_list.docx";
		//
		// String tempFilePath = path + file;
		InputStream is = null;
		XWPFDocument doc = null;
		try {
			is = new FileInputStream(tempFilePath);
			doc = new XWPFDocument(is);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*if (doc == null) {

			return null;
		}*/
		// 获取文档中所有的表格
		List<XWPFTable> tables = doc.getTables();
		XWPFTable table = tables.get(0);

		for (int i = 0; i < list.size(); i++) {
			TQualityReview temp = list.get(i);
			XWPFTableRow row = table.createRow();
			row.getCell(0).setText((i + 1) + "");
			row.getCell(1).setText(temp.getMaterialName());
			row.getCell(2).setText(temp.getSpecifications());
			row.getCell(3).setText(temp.getReportName());
			row.getCell(4).setText(temp.getMaterialNum());
			row.getCell(5).setText(temp.getCheckResult());
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String dateString = formatter.format(temp.getCheckDate());
			row.getCell(6).setText(dateString);

			for (XWPFTableCell cell : row.getTableCells()) {
				cell.getParagraphs().get(0).setAlignment(ParagraphAlignment.CENTER);
			}
		}

		FileOutputStream out;
		try {
			out = new FileOutputStream(metrialListPath);

			doc.write(out);
			out.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			is.close();
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//return metrialListPath.substring(metrialListPath.indexOf("console")+7);
		TFileForm tPlanForm = new TFileForm();
		
		tPlanForm.setFileFormFilename("checkreview.docx");
		/*tPlanForm.setFileFormContent(mf.getBytes());*/
		tPlanForm.setFileFormName("质量审核书");
		tPlanForm.setFileFormPeople(userName);
		tPlanForm.setFileFormUserId((int)userId);
		tPlanForm.setFileFormDate(new Date(new java.util.Date().getTime()));
		tPlanForm.setFileFormProjectId(proId);
		tPlanForm.setFileFormCurrentStatus("D");
		tPlanForm.setFileFormCurrentStatusNum(0);
		tPlanForm.setFileFormNotpassTimes(0);
		tPlanForm.setFileFormType("质量审核书");
		//设置存放的服务器路径
		tPlanForm.setFileFormPath("checkreview.docx");
		return tPlanForm;
		//download(HttpServletResponse response, HttpServletRequest request,int type,int fileId)
		//AutoCreateFileName.FilesDownload(request, response,"/upload/"+proId+"/material_list.docx");
	}

	/**
	 * @Description: 跨列合并
	 */
	public static void mergeCellsHorizontal(XWPFTable table, int row, int fromCell, int toCell) {
		for (int cellIndex = fromCell; cellIndex <= toCell; cellIndex++) {
			XWPFTableCell cell = table.getRow(row).getCell(cellIndex);
			if (cellIndex == fromCell) {
				// The first merged cell is set with RESTART merge value
				cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.RESTART);
			} else {
				// Cells which join (merge) the first one, are set with CONTINUE
				cell.getCTTc().addNewTcPr().addNewHMerge().setVal(STMerge.CONTINUE);
			}
		}
	}

	/**
	 * @Description: 跨行合并
	 */
	public static void mergeCellsVertically(XWPFTable table, int col, int fromRow, int toRow) {
		for (int rowIndex = fromRow; rowIndex <= toRow; rowIndex++) {
			XWPFTableCell cell = table.getRow(rowIndex).getCell(col);
			if (rowIndex == fromRow) {
				// The first merged cell is set with RESTART merge value
				cell.getCTTc().addNewTcPr().addNewVMerge().setVal(STMerge.RESTART);
			} else {
				// Cells which join (merge) the first one, are set with CONTINUE
				cell.getCTTc().addNewTcPr().addNewVMerge().setVal(STMerge.CONTINUE);
			}
		}
	}

	public static void replaceText(XWPFParagraph para, String old, String now) {
		for (int i = 0; i < para.getRuns().size(); i++) {
			String oneparaString = para.getRuns().get(i).getText(para.getRuns().get(i).getTextPosition());
			//System.out.println(oneparaString+"   one");
			// System.out.println(oneparaString);
			if (oneparaString.contains(old)) {
				para.getRuns().get(i).setText(now, 0);
			}

		}
	}

	/**
	 * @author admin 需要开启openoffice服务
	 * @param sourceFile
	 *            原文件路径
	 * @param destFile
	 *            存储路径
	 * @return 1:成功，－1:找不到原文件
	 * @throws FileNotFoundException
	 * @throws ConnectException
	 * @throws IOException
	 */

	public static int office2PDF(String sourceFile, String destFile)
			throws FileNotFoundException, ConnectException, IOException {
		File inputFile = new File(sourceFile);
		if (!inputFile.exists()) {
			return -1;// 找不到源文件, 则返回-1
		}

		// 如果目标路径不存在, 则新建该路径
		File outputFile = new File(destFile);
		if (!outputFile.getParentFile().exists()) {
			outputFile.getParentFile().mkdirs();
		}

		// connect to an OpenOffice.org instance running on port 8100
		OpenOfficeConnection connection = new SocketOpenOfficeConnection("127.0.0.1", 8100);
		try {
			connection.connect();
		} catch (java.net.ConnectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// convert
		DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
		converter.convert(inputFile, outputFile);

		// close the connection
		connection.disconnect();

		return 1;
	}
	

	
	
	private void getData(Map<String, Object> dataMap,List<TGoodsLists> lists) {
		List<Map<String, Object>> newsList=new ArrayList<Map<String,Object>>();  
        for(int i=1;i<=lists.size();i++){  
         Map<String, Object> map=new HashMap<String, Object>();  
         map.put("id", i+1);  
         map.put("goodType", lists.get(i).getGoodType());  
         map.put("goodName", lists.get(i).getGoodName());  
         map.put("goodSpecifications", lists.get(i).getGoodSpecifications());  
         map.put("goodOrderNum", lists.get(i).getGoodOrderNum());  
         map.put("goodUnit", lists.get(i).getGoodUnit());
         map.put("goodNote", lists.get(i).getGoodUnit());
         newsList.add(map);  
        }  
        dataMap.put("newsList",newsList);

	}
}
