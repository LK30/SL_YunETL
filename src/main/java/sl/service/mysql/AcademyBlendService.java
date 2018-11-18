package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.AcademyBlendDao;
import sl.entities.AcademyBlend;

import javax.annotation.Resource;
import java.util.List;

@Service("academyBlendService")
public class AcademyBlendService {
    @Resource
    AcademyBlendDao academyBlendDao;
    public List<AcademyBlend> getAllAcademyBlend(){
        return academyBlendDao.getAllAcademyBlend();
    }
}
