package sys.spvisor.console.converter;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.itextpdf.tool.xml.css.CSS.Value;

import sys.spvisor.core.entity.work.TQualityCheckRecoder;
import sys.spvisor.core.entity.work.TQualityFileRecoder;
import sys.spvisor.core.entity.work.TQualityPeopleRecoder;

public class WorkConverter {
	SimpleDateFormat format;
	
	public WorkConverter(){
		format = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public Map<String, String> qualityFileRecoderConverter(TQualityFileRecoder tQualityFileRecoder){
		Map<String, String> map = new HashMap<>();
		map.put("designName", tQualityFileRecoder.getDesignName());//资质证书/工艺文件/设计图纸名称
		map.put("numVersion", tQualityFileRecoder.getNumVersion());//编号/版本
		map.put("unit", tQualityFileRecoder.getUnit());//发证/编制单位
		map.put("validDate", tQualityFileRecoder.getValidDate());//有效期
		map.put("fileName", tQualityFileRecoder.getFileName());//文件名称
		map.put("uploadTime", format.format(tQualityFileRecoder.getUploadTime()));//上传时间
		return map;
	}
	
	public Map<String, String> qualityPeopleRecoderConverter(TQualityPeopleRecoder tQualityPeopleRecoder){
		Map<String, String> map = new HashMap<>();
		map.put("userName", tQualityPeopleRecoder.getUserName());//姓名
		map.put("job",tQualityPeopleRecoder.getJob());//岗位
		map.put("zhengshuName", tQualityPeopleRecoder.getZhengshuName());//证书名称
		map.put("num", tQualityPeopleRecoder.getNum());//编号
		map.put("licenseUnit", tQualityPeopleRecoder.getLicenseUnit());//发证单位
		map.put("validDate", tQualityPeopleRecoder.getValidDate());//有效期
		map.put("fileName", tQualityPeopleRecoder.getFileName());//文件名称
		map.put("postTime",format.format(tQualityPeopleRecoder.getPostTime()));//上传时间
		return map;
	}
	
	public Map<String, String> qualityCheckRecoderConverter(TQualityCheckRecoder tQualityCheckRecoder){
		Map<String, String> map = new HashMap<>();
		map.put("deviceName", tQualityCheckRecoder.getDeviceName());//设备名称
		map.put("deviceNo",tQualityCheckRecoder.getDeviceNo());//编号
		map.put("yunxingQingkuang", tQualityCheckRecoder.getYunxingQingkuang());//运行状况
		map.put("productFactory", tQualityCheckRecoder.getProductFactory());//上产厂家
		map.put("bookNo", tQualityCheckRecoder.getBookNo());//检定证书号
		map.put("validDate", tQualityCheckRecoder.getValidDate());//有效期
		map.put("fileName",tQualityCheckRecoder.getFileName());//文件名称
		map.put("postTime",format.format(tQualityCheckRecoder.getPostTime()));//上传时间
		return map;
	}

}
