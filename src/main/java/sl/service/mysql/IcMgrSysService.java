package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.GctrlSysDao;
import sl.dao.mysql.IcMgrSysDao;
import sl.entities.GctrlSys;
import sl.entities.IcMgrSys;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("icMgrSysService")
public class IcMgrSysService {
    @Resource
    IcMgrSysDao icMgrSysDao;
    public List<IcMgrSys> getRowInfoById(Map<String,Long> index){
        return icMgrSysDao.getRowInfoById(index);
    }
    public Map<String,Long> getRowIndex(){
        return icMgrSysDao.getRowIndex();
    }
}
