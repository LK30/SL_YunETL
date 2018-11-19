package sl.dao.mysql;

import sl.entities.Identity;

import java.util.List;

public interface IdentityDao {
    List<Identity> getAllIdentity();
}
