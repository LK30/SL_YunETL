package sl.dao.mysql;

import sl.entities.BookCategery;

import java.util.List;

public interface BookCategoryDao {
    List<BookCategery> getAllCategory();
}
