package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.BookRenewSysDao;
import sl.dao.mysql.EventLogDao;
import sl.entities.BookLend;
import sl.entities.EventLog;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("eventLogService")
public class EventLogService {
    @Resource
    EventLogDao eventLogDao;
    public List<EventLog> getRowInfoById(Map<String,Long> index){
        return eventLogDao.getRowInfoById(index);
    }
    public Map<String,Long> getRowIndex(){
        return eventLogDao.getRowIndex();
    }
}
