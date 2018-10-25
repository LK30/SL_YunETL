package sl.service;

import org.springframework.stereotype.Service;
import sl.dao.mysql.testDao;
import sl.entities.test;

import javax.annotation.Resource;
import java.util.List;

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
}
