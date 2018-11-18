package sl.appTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tt on 2018/10/24.
 */
public class mainTest {
    public static void main(String[] args) {
        //BookLendFeature bookLendFeature = new BookLendFeature();
       // bookLendFeature.insertBookCategory();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
