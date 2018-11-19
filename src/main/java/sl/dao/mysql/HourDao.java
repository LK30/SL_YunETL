package sl.dao.mysql;

import sl.entities.Hour;

import java.util.List;

public interface HourDao {
    List<Hour> getHours();
}
