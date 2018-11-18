package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.GctrlSysDao;
import sl.entities.BookLend;
import sl.entities.GctrlSys;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("gctrlSysService")
public class GctrlSysService {
    @Resource
    GctrlSysDao gctrlSysDao;
    public List<GctrlSys> getRowInfoById(Map<String,Long> index){
        return gctrlSysDao.getRowInfoById(index);
    }
    public Map<String,Long> getRowIndex(){
        return gctrlSysDao.getRowIndex();
    }
}
