package sl.appTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sl.entities.BookLend;
import sl.service.mysql.testService;

import java.util.List;

/**
 * Created by tt on 2018/11/6.
 */
public class k {
    public static void main(String[] args) {
       // OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
      //  System.out.println("getProcessCpuLoad   "+operatingSystemMXBean.getProcessCpuLoad());
        testForeach();
    }

    public static void  testForeach(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        testService s =(testService)ctx.getBean("testService");
        long startGetBook = System.currentTimeMillis();
        List<BookLend> list = s.getTestBookList ();
        long endGetBook = System.currentTimeMillis();
        System.out.print("获取数据时间  ");
        System.out.println(endGetBook-startGetBook);
        int count=list.size();
        long startModify = System.currentTimeMillis();
        for(int i=0;i<count;i++){
            BookLend b = list.get(i);
            String name = b.getBook_name();
            name = name +"45";
            b.setBook_name(name);
        }
        long endModify = System.currentTimeMillis();
        System.out.print("修改数据时间  ");
        System.out.println(endModify-startModify);

        System.out.print("总时间  ");
        System.out.println(endModify-startGetBook);
    }
}
