package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.testDao;
import sl.entities.BookLend;
import sl.entities.test;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by tt on 2018/10/24.
 */
@Service
public class testService {
    @Resource
    testDao testdao;

    public List<test> getAll() {
        return testdao.getAlltest();
    }
    public List<BookLend> getRowInfoById(Map<String,Long> index){
        return testdao.getRowInfoById(index);
    }
    public Map<String,Long> getRowIndex(){
        return testdao.getRowIndex();
    }
}
