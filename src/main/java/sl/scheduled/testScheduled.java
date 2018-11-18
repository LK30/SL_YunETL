package sl.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by tt on 2018/11/18.
 */
@Component
public class testScheduled {

    @Scheduled(cron = "* * * * * ?")//每分钟都执行
    public void test(){
        System.out.println("执行");
    }
}
