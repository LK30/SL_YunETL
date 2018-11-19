package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.BookRenewSysDao;
import sl.entities.BookLend;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("bookRenewSysService")
public class BookRenewSysService {
    @Resource
    BookRenewSysDao bookRenewSysDao;
    public List<BookLend> getRowInfoById(Map<String,Long> index){
        return bookRenewSysDao.getRowInfoById(index);
    }
    public Map<String,Long> getRowIndex(){
        return bookRenewSysDao.getRowIndex();
    }
}
