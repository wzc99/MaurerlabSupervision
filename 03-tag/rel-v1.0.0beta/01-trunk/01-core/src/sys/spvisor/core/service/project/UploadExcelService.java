package sys.spvisor.core.service.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sys.file.common.ReadExcel;
import sys.spvisor.core.dao.project.TGoodsListsMapper;
import sys.spvisor.core.entity.project.TGoodsLists;

@Service
public class UploadExcelService {
	@Autowired
	TGoodsListsMapper mapper;
	//批量导入客户
    public  List<TGoodsLists> batchImport(String name,MultipartFile file){
        //创建处理EXCEL
        ReadExcel readExcel=new ReadExcel();
        //解析excel，获取客户信息集合。
        List<TGoodsLists> goodList = readExcel.getExcelInfo(name ,file);
        return goodList;
    }
}
