package sl.appTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sl.entities.mongodb.mongoTest;
import sl.entities.mysql.test;
import sl.service.mongodb.mongoTestService;
import sl.service.mysql.testService;

import java.util.List;

/**
 * Created by tt on 2018/10/24.
 */
public class mainTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //测试mysql
        testService s=(testService)ctx.getBean("testService");
        List<test> t=s.getAll();
        System.out.println(t.get(2).getId());

        //测试mongodb
        mongoTestService s2=(mongoTestService)ctx.getBean("mongoTestService");
        List<mongoTest> t2=s2.getAll();
        System.out.println(t2.get(0).get_id());
    }
}
