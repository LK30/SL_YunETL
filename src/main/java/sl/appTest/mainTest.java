package sl.appTest;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sl.entities.BookLend;
import sl.entities.test;
import sl.feature.BookLendFeature;
import sl.service.mongodb.mongoTestService;
import sl.service.mysql.BookBackSysService;
import sl.service.mysql.GctrlSysService;
import sl.service.mysql.testService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tt on 2018/10/24.
 */
public class mainTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        mongoTestService s2 = (mongoTestService)ctx.getBean("mongoTestService");
        BookLendFeature bookLendFeature = new BookLendFeature();
        bookLendFeature.importPrintType(ctx,s2);
    }
}
