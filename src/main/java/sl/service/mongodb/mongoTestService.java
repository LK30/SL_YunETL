package sl.service.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import sl.entities.*;

import java.util.List;

/**
 * Created by tt on 2018/10/29.
 */
@Service("mongoTestService")
public class mongoTestService {
    @Autowired
    MongoOperations mongoTemplate;

    public List<test> getAll() {
        Criteria criteria = Criteria.where("id").is(1);
        Query query = new Query(criteria);
        List<test> list = mongoTemplate.find(query, test.class);
        return list;
    }

    public void insert() {
        test t =new test();
        t.setId(12433);
       mongoTemplate.insert(t,"test");
    }

    /**插入借阅数据*/
    public void insetBookLend(List<BookLend> list){
        mongoTemplate.insert(list,"z_book_lend_sys");
    }
    /** 插入还书数据*/
    public void insertBookBack(List<BookLend> list){
        mongoTemplate.insert(list,"z_book_back_sys");
    }
    /**插入尽管数据*/
    public void insertGctrl(List<GctrlSys> list){
        mongoTemplate.insert(list,"z_gctrl_ctrl_sys");
    }
    /**插入一个学校的学院数据*/
    public void insertAcademy(List<Academy> list){ mongoTemplate.insert(list,"z_academu_org"); }
    /**插入z_academy_blend*/
    public void insertAcademyBlend(List<AcademyBlend> list){ mongoTemplate.insert(list,"z_academy_blend");}
    /**插入书籍类型 */
    public void insertBookCategory(List<BookCategery> list){ mongoTemplate.insert(list,"z_book_category"); }
}
