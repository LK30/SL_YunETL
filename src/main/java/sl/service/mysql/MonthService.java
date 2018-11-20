package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.MonthDao;
import sl.entities.Month;

import javax.annotation.Resource;
import java.util.List;

@Service("monthService")
public class MonthService {
    @Resource
    MonthDao monthDao;

    public List<Month> getAllMonth(){
        return monthDao.getAllMonth();
    }
}
