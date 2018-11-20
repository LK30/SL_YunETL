package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.PrintLocationDao;
import sl.entities.PrintLocation;

import javax.annotation.Resource;
import java.util.List;

@Service("printLocationService")
public class PrintLocationService {
    @Resource
    PrintLocationDao printLocationDao;
    public List<PrintLocation> getPrintLocations(){
        return printLocationDao.getPrintLocation();
    }
}
