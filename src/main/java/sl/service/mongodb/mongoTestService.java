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
    public void insertAcademy(List<Academy> list){ mongoTemplate.insert(list,"z_academy_org"); }
    /**插入z_academy_blend*/
    public void insertAcademyBlend(List<AcademyBlend> list){ mongoTemplate.insert(list,"z_academy_blend");}
    /**插入书籍类型 */
    public void insertBookCategory(List<BookCategery> list){ mongoTemplate.insert(list,"z_book_category"); }
    /** 插入书籍类型temp*/
    public void insertBookCategoryTemp(List<BookCategoryTemp> lsit){mongoTemplate.insert(lsit,"z_book_category_temp"); }
    /** 插入续借 数据*/
    public void insertBookRenew(List<BookLend> list){mongoTemplate.insert(list,"z_book_renew_sys");}
    /** 插入日志 数据*/
    public void insertEventLog(List<EventLog> list){mongoTemplate.insert(list,"z_event_log");}
    /** 插入小时数据*/
    public void insertHours(List<Hour> list){ mongoTemplate.insert(list,"hour"); }
    /** 插入身份数据*/
    public void insertIdentity(List<Identity> list){ mongoTemplate.insert(list,"identity");}
    /**  插入身份Blend数据*/
    public void insertIdentityBlend(List<IdentityBlend> list){ mongoTemplate.insert(list,"z_identity_blend"); }
    /** 插入Ic空间数据*/
    public void insertIcMgr(List<IcMgrSys> list){mongoTemplate.insert(list,"z_ic_mgr_sys");}
    /**插入月份*/
    public void insertMonth(List<Month> list){mongoTemplate.insert(list,"month");}
    /** 插入打印地点*/
    public void insertPrintLocation(List<PrintLocation> list){ mongoTemplate.insert(list,"z_prints_location");}
    /** 插入纸张类型*/
    public void insertPrintPaperType(List<PrintPaperType> list){mongoTemplate.insert(list,"z_print_papertype");}
    /** 插入打印类型 */
    public void insertPirntType(List<PrintType> list){mongoTemplate.insert(list,"z_print_print_type");}
}
