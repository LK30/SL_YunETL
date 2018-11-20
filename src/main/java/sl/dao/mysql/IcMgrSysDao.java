package sl.dao.mysql;

import sl.entities.GctrlSys;
import sl.entities.IcMgrSys;

import java.util.List;
import java.util.Map;

public interface IcMgrSysDao {
    /**
     * 按照开始id 和结束id 得到介于id之间的数据
     * @return
     */
    List<IcMgrSys> getRowInfoById(Map<String,Long> map);

    /**
     * 获取一张表的id的最大值 和最小值
     * @return
     */
    Map<String,Long> getRowIndex();
}
