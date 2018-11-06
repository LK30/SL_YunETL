package sl.service.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import sl.entities.BookLend;
import sl.entities.test;

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

    public void insetBookLend(List<BookLend> list){
        mongoTemplate.insert(list,"z_book_lend_sys");
//
//        for(int i = 0; i < list.size(); i++){
//            mongoTemplate.insert(list.get(i),"z_book_lend_sys");
//        }
    }
}
