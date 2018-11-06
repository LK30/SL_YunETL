package sl.appTest;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sl.entities.BookLend;
import sl.entities.test;
import sl.service.mongodb.mongoTestService;
import sl.service.mysql.testService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tt on 2018/10/24.
 */
public class mainTest {
    public static void main(String[] args) {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        mongoTestService s2 = (mongoTestService)ctx.getBean("mongoTestService");
        testService s =(testService)ctx.getBean("testService");
        Map<String,Long> map = s.getRowIndex();

        /**************************************大表分表查询*********************************************/
        /** 最小id*/
        Long minRowIndex =  map.get("minIndex");
        /** 最大id*/
        Long maxRowIndex =  map.get("maxIndex");
        /** 表总共条数*/
        Long rowsCnt = maxRowIndex - minRowIndex + 1;
        /** 每次循环查询条数*/
        Long rowsSelectPerExe = (long)1000;
        /** 取整多余部分*/
        Long remainder = rowsCnt % rowsSelectPerExe;
        /** 循环次数*/
        Long executionNum = ( maxRowIndex - minRowIndex + 1 - remainder ) / rowsSelectPerExe;
        long tmp = minRowIndex;
        System.out.println("循环次数 = " + executionNum);
        for(int i = 1; i <= executionNum  + 1; i ++){
            System.out.println("循环了" + i + "次");
            Map<String,Long> index = new HashMap<String, Long>();
            /** 余数处理*/
            if(i == executionNum  + 1){
                if(remainder != 0){
                    index.put("start",maxRowIndex - remainder + 1);
                    index.put("end",maxRowIndex);
                    List<BookLend> list = s.getRowInfoById(index);
                    s2.insetBookLend(list);
                }else {
                    break;
                }
            }
            index.put("start",tmp);
            index.put("end",tmp + rowsSelectPerExe - 1);
            tmp += executionNum;
            List<BookLend> list = s.getRowInfoById(index);
            System.out.println("数据已经拿到 **************************************");
            s2.insetBookLend(list);
            System.out.println("**************************已处理了（"+ i + "） 次************************");
        }
        /********************************************************************************************** */
        //测试mongodb select
//        mongoTestService s2 = (mongoTestService)ctx.getBean("mongoTestService");
//        s2.insetBookLend(t);


        /**
         //测试mongodb select
         mongoTestService s2=(mongoTestService)ctx.getBean("mongoTestService");
         List<test> t2=s2.getAll();
         System.out.println(t2.get(0).get_id());


         //测试mongodb select
         s2.insert();
         * */
    }
}
