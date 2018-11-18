package sl.service.mysql;

import org.springframework.stereotype.Service;
import sl.dao.mysql.BookCategoryDao;
import sl.entities.BookCategery;

import javax.annotation.Resource;
import java.util.List;

@Service("bookCategoryService")
public class BookCategoryService {
    @Resource
    BookCategoryDao bookCategoryDao;
    public List<BookCategery> getAllCategory(){
        return bookCategoryDao.getAllCategory();
    }
}
