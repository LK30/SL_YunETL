package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.AcademyDao;
import sl.entities.Academy;

import javax.annotation.Resource;
import java.util.List;

@Service("academyService")
public class AcademyService {
    @Resource
    AcademyDao academyDao;
    public List<Academy> getAllAcademy(){
        return academyDao.getAllAcademy();
    }
}
