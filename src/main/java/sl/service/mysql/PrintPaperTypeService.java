package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.PrintPaperTypeDao;
import sl.entities.PrintPaperType;

import javax.annotation.Resource;
import java.util.List;

@Service("printPaperTypeService")
public class PrintPaperTypeService {
    @Resource
    PrintPaperTypeDao printPaperTypeDao;
    public List<PrintPaperType> getPrintPaperType(){
        return printPaperTypeDao.getPrintPaperType();
    }
}
