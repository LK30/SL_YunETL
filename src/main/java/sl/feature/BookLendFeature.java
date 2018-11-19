package sl.feature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sl.entities.*;
import sl.service.mongodb.mongoTestService;
import sl.service.mysql.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLendFeature {
    /** 导入z_book_lend_sys  借书表*/
    public void importBookLendData(ApplicationContext ctx,mongoTestService s2){
        /** 借书*/
        testService s =(testService)ctx.getBean("testService");
        Map<String,Long> map = s.getRowIndex();
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
        System.out.println("余下条数 = " + remainder);
        for(int i = 1; i <= executionNum  + 1; i ++){
            System.out.println("第" + i + " 次开始处理");
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
            tmp  = (tmp + rowsSelectPerExe);
            List<BookLend> list = s.getRowInfoById(index);
            System.out.println("数据已经拿到 **************************************");
            s2.insetBookLend(list);
            System.out.println("**************************已处理了（"+ i + "） 次************************");
        }
    }

    public void importBookBackSysData(ApplicationContext ctx,mongoTestService s2){
        BookBackSysService bookBackSysService =(BookBackSysService)ctx.getBean("bookBackSysService");
        Map<String,Long> bookBackmap = bookBackSysService.getRowIndex();
        /** 最小id*/
        Long minRowIndex =  bookBackmap.get("minIndex");
        /** 最大id*/
        Long maxRowIndex =  bookBackmap.get("maxIndex");
        /** 表总共条数*/
        long rowsCnt = maxRowIndex - minRowIndex + 1;
        /** 每次循环查询条数*/
        long rowsSelectPerExe = (long)10000;
        /** 取整多余部分*/
        Long remainder = rowsCnt % rowsSelectPerExe;
        /** 循环次数*/
        long executionNum = ( maxRowIndex - minRowIndex + 1 - remainder ) / rowsSelectPerExe;
        long tmp = minRowIndex;
        System.out.println("循环次数 = " + executionNum);
        for(int i = 1; i <= executionNum  + 1; i ++){
            System.out.println("第" + i + " 次开始处理");
            Map<String,Long> index = new HashMap<String, Long>();
            System.out.println( "开始id =  " + tmp + "  结束id = " + (tmp + rowsSelectPerExe - 1));
            /** 余数处理*/
            if(i == executionNum  + 1){
                if( remainder != 0){
                    index.put("end",maxRowIndex);
                    index.put("start",maxRowIndex - remainder + 1);
                    List<BookLend> list = bookBackSysService.getRowInfoById(index);
                    s2.insertBookBack(list);
                }else {
                    break;
                }
            }
            index.put("start",tmp);
            index.put("end",tmp + rowsSelectPerExe - 1);
            tmp = (tmp + rowsSelectPerExe);
            List<BookLend> list = bookBackSysService.getRowInfoById(index);
            System.out.println("数据已经拿到 **************************************");
            s2.insertBookBack(list);
            System.out.println("**************************已处理了（"+ i + "） 次************************");
        }
    }

    public void importGctrlData(ApplicationContext ctx,mongoTestService s2){
        GctrlSysService gctrlSysService =(GctrlSysService)ctx.getBean("gctrlSysService");
        Map<String,Long> bookBackmap = gctrlSysService.getRowIndex();
        /** 最小id*/
        Long minRowIndex =  bookBackmap.get("minIndex");
        /** 最大id*/
        Long maxRowIndex =  bookBackmap.get("maxIndex");
        /** 表总共条数*/
        long rowsCnt = maxRowIndex - minRowIndex + 1;
        /** 每次循环查询条数*/
        long rowsSelectPerExe = (long)10000;
        /** 取整多余部分*/
        Long remainder = rowsCnt % rowsSelectPerExe;
        /** 循环次数*/
        long executionNum = ( maxRowIndex - minRowIndex + 1 - remainder ) / rowsSelectPerExe;
        long tmp = minRowIndex;
        System.out.println("循环次数 = " + executionNum);
        for(int i = 1; i <= executionNum  + 1; i ++){
            System.out.println("第" + i + " 次开始处理");
            Map<String,Long> index = new HashMap<String, Long>();
            System.out.println( "开始id =  " + tmp + "  结束id = " + (tmp + rowsSelectPerExe - 1));
            /** 余数处理*/
            if(i == executionNum  + 1){
                if( remainder != 0){
                    index.put("end",maxRowIndex);
                    index.put("start",maxRowIndex - remainder + 1);
                    List<GctrlSys> list = gctrlSysService.getRowInfoById(index);
                    s2.insertGctrl(list);
                }else {
                    break;
                }
            }
            index.put("start",tmp);
            index.put("end",tmp + rowsSelectPerExe - 1);
            tmp = (tmp + rowsSelectPerExe);
            List<GctrlSys> list = gctrlSysService.getRowInfoById(index);
            System.out.println("数据已经拿到 **************************************");
            s2.insertGctrl(list);
            System.out.println("**************************已处理了（"+ i + "） 次************************");
        }
        System.out.println("导入完毕");
    }

    public void importAcademy(ApplicationContext ctx,mongoTestService s2){
        AcademyService academyService = (AcademyService) ctx.getBean("academyService");
        List<Academy> list = academyService.getAllAcademy();
        s2.insertAcademy(list);
        System.out.println("导入完毕");
    }
    public void  importAcademyBlend(ApplicationContext ctx,mongoTestService s2){
        AcademyBlendService academyBlendService = (AcademyBlendService) ctx.getBean("academyBlendService");
        List<AcademyBlend> list = academyBlendService.getAllAcademyBlend();
        s2.insertAcademyBlend(list);
        System.out.println("导入成功");
    }
    public void importBookCategory(ApplicationContext ctx,mongoTestService s2){
        BookCategoryService bookCategoryService = (BookCategoryService) ctx.getBean("bookCategoryService");
        List<BookCategery> list = bookCategoryService.getAllCategory();
        s2.insertBookCategory(list);
        System.out.println("导入成功");
    }

    public void importBookCategoryTemp(ApplicationContext ctx,mongoTestService s2){
        BookCategoryTempService bookCategoryTempService = (BookCategoryTempService)ctx.getBean("bookCategoryTempService");
        List<BookCategoryTemp> list = bookCategoryTempService.getAllCategoryTemp();
        s2.insertBookCategoryTemp(list);
        System.out.println("导入成功");
    }

    public void importBookRenew(ApplicationContext ctx,mongoTestService s2){
        BookRenewSysService bookRenewSysService =(BookRenewSysService)ctx.getBean("bookRenewSysService");
        Map<String,Long> bookBackmap = bookRenewSysService.getRowIndex();
        /** 最小id*/
        Long minRowIndex =  bookBackmap.get("minIndex");
        /** 最大id*/
        Long maxRowIndex =  bookBackmap.get("maxIndex");
        /** 表总共条数*/
        long rowsCnt = maxRowIndex - minRowIndex + 1;
        /** 每次循环查询条数*/
        long rowsSelectPerExe = (long)10000;
        /** 取整多余部分*/
        Long remainder = rowsCnt % rowsSelectPerExe;
        /** 循环次数*/
        long executionNum = ( maxRowIndex - minRowIndex + 1 - remainder ) / rowsSelectPerExe;
        long tmp = minRowIndex;
        System.out.println("循环次数 = " + executionNum);
        for(int i = 1; i <= executionNum  + 1; i ++){
            System.out.println("第" + i + " 次开始处理");
            Map<String,Long> index = new HashMap<String, Long>();
            System.out.println( "开始id =  " + tmp + "  结束id = " + (tmp + rowsSelectPerExe - 1));
            /** 余数处理*/
            if(i == executionNum  + 1){
                if( remainder != 0){
                    index.put("end",maxRowIndex);
                    index.put("start",maxRowIndex - remainder + 1);
                    List<BookLend> list = bookRenewSysService.getRowInfoById(index);
                    s2.insertBookRenew(list);
                }else {
                    break;
                }
            }
            index.put("start",tmp);
            index.put("end",tmp + rowsSelectPerExe - 1);
            tmp = (tmp + rowsSelectPerExe);
            List<BookLend> list = bookRenewSysService.getRowInfoById(index);
            System.out.println("数据已经拿到 **************************************");
            s2.insertBookRenew(list);
            System.out.println("**************************已处理了（"+ i + "） 次************************");
        }
        System.out.println("导入完毕");
    }
    public void importEventLog(ApplicationContext ctx,mongoTestService s2){
        EventLogService eventLogService =(EventLogService)ctx.getBean("eventLogService");
        Map<String,Long> bookBackmap = eventLogService.getRowIndex();
        /** 最小id*/
        Long minRowIndex =  bookBackmap.get("minIndex");
        /** 最大id*/
        Long maxRowIndex =  bookBackmap.get("maxIndex");
        /** 表总共条数*/
        long rowsCnt = maxRowIndex - minRowIndex + 1;
        /** 每次循环查询条数*/
        long rowsSelectPerExe = (long)10000;
        /** 取整多余部分*/
        Long remainder = rowsCnt % rowsSelectPerExe;
        /** 循环次数*/
        long executionNum = ( maxRowIndex - minRowIndex + 1 - remainder ) / rowsSelectPerExe;
        long tmp = minRowIndex;
        System.out.println("循环次数 = " + executionNum);
        for(int i = 1; i <= executionNum  + 1; i ++){
            System.out.println("第" + i + " 次开始处理");
            Map<String,Long> index = new HashMap<String, Long>();
            System.out.println( "开始id =  " + tmp + "  结束id = " + (tmp + rowsSelectPerExe - 1));
            /** 余数处理*/
            if(i == executionNum  + 1){
                if( remainder != 0){
                    index.put("end",maxRowIndex);
                    index.put("start",maxRowIndex - remainder + 1);
                    List<EventLog> list = eventLogService.getRowInfoById(index);
                    s2.insertEventLog(list);
                }else {
                    break;
                }
            }
            index.put("start",tmp);
            index.put("end",tmp + rowsSelectPerExe - 1);
            tmp = (tmp + rowsSelectPerExe);
            List<EventLog> list = eventLogService.getRowInfoById(index);
            System.out.println("数据已经拿到 **************************************");
            s2.insertEventLog(list);
            System.out.println("**************************已处理了（"+ i + "） 次************************");
        }
        System.out.println("导入完毕");
    }

    public void importHours(ApplicationContext ctx,mongoTestService s2){
        HourService hourService = (HourService) ctx.getBean("hourService");
        List<Hour> list = hourService.getHours();
        s2.insertHours(list);
        System.out.println("导入成功");
    }
    public void importIdentity(ApplicationContext ctx,mongoTestService s2){
        IdentityService identityService = (IdentityService) ctx.getBean("identityService");
        List<Identity> list = identityService.getAllIdentity();
        s2.insertIdentity(list);
        System.out.println("导入成功");
    }


}
