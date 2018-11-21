package sl.dao.mysql;

import sl.entities.BookLend;
import sl.entities.test;

import java.util.List;
import java.util.Map;

/**
 * Created by tt on 2018/10/24.
 */
public interface testDao {

    List<test> getAlltest();

    /**
     * 按照开始id 和结束id 得到介于id之间的数据
     * @return
     */
    List<BookLend> getRowInfoById(Map<String,Long> map);

    /**
     * 获取一张表的id的最大值 和最小值
     * @return
     */
     Map<String,Long> getRowIndex();

     List<BookLend> getTestBookList();

    void insertTestBookList(List<BookLend> list);
}
