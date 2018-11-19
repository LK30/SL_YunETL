package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.HourDao;
import sl.entities.Hour;

import javax.annotation.Resource;
import java.util.List;

@Service("hourService")
public class HourService {
    @Resource
    HourDao hourDao;
    public List<Hour> getHours(){
        return hourDao.getHours();
    }
}
