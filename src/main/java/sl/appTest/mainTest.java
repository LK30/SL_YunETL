package sl.appTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sl.entities.test;
import sl.service.testService;

import java.util.List;

/**
 * Created by tt on 2018/10/24.
 */
public class mainTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        testService s=ctx.getBean(testService.class);
        List<test> t=s.getAll();
        System.out.println(t.size());
    }
}
