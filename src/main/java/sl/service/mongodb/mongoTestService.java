package sl.service.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import sl.entities.mongodb.mongoTest;

import java.util.List;

/**
 * Created by tt on 2018/10/29.
 */
@Service("mongoTestService")
public class mongoTestService {
    @Autowired
    MongoOperations mongoTemplate;

    public List<mongoTest> getAll() {
        Criteria criteria = Criteria.where("id").is(1);
        Query query = new Query(criteria);
        List<mongoTest> list = mongoTemplate.find(query, mongoTest.class);
        return list;
    }
}
