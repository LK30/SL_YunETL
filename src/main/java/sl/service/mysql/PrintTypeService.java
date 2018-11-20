package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.PrintTypeDao;
import sl.entities.PrintType;

import javax.annotation.Resource;
import java.util.List;

@Service("printTypeService")
public class PrintTypeService {
    @Resource
    PrintTypeDao printTypeDao;
    public List<PrintType> getPrintType(){
        return printTypeDao.getPrintType();
    }
}
