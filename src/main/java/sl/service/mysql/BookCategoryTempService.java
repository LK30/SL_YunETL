package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.BookCategoryTempDao;
import sl.entities.BookCategoryTemp;

import javax.annotation.Resource;
import java.util.List;

@Service("bookCategoryTempService")
public class BookCategoryTempService {
    @Resource
    BookCategoryTempDao bookCategoryTempDao;
    public List<BookCategoryTemp> getAllCategoryTemp(){
        return  bookCategoryTempDao.getAllCategoryTemp();
    }
}
