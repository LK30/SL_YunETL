package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.BookBackSysDao;
import sl.entities.BookLend;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class BookBackSysService {
    @Resource
    BookBackSysDao bookBackSysDao;
    public List<BookLend> getRowInfoById(Map<String,Long> index){
        return bookBackSysDao.getRowInfoById(index);
    }
    public Map<String,Long> getRowIndex(){
        return bookBackSysDao.getRowIndex();
    }
}


