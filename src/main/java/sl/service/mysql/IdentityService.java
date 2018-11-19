package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.IdentityDao;
import sl.entities.Identity;

import javax.annotation.Resource;
import java.util.List;

@Service("identityService")
public class IdentityService {
    @Resource
    IdentityDao identityDao;
    public List<Identity> getAllIdentity(){
        return identityDao.getAllIdentity();
    }
}
