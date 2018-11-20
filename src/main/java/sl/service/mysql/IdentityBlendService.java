package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.IdentityBlendDao;
import sl.entities.IdentityBlend;

import javax.annotation.Resource;
import java.util.List;
@Service("identityBlendService")
public class IdentityBlendService {
    @Resource
    IdentityBlendDao identityBlendDao;
    public List<IdentityBlend> getAllIdentityBlend(){
        return identityBlendDao.getAllIdentityBlend();
    }
}
