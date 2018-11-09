package com.ccsu.quartz;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/6
 * @Time: 23:12
 * Description: quartz 的学习
 */
public class HelloJob implements Job {

    //也可以通过构建 setter 方法 ，反射调用 key 所对应的值。          jobDataMap.getString("");
    private String key1;
    private String key2;


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println("current time is :" + format);
        System.out.println("hello world");

        // 第二部分
        jobExecutionContext.getJobDetail().getKey().getGroup();
        jobExecutionContext.getJobDetail().getKey().getName();
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        jobDataMap.getString("");

        jobExecutionContext.getTrigger().getKey().getGroup();
        jobExecutionContext.getTrigger().getKey().getName();
        JobDataMap mergedJobDataMap = jobExecutionContext.getMergedJobDataMap();
        //若 key 相同 ，优先展示 trigger
        mergedJobDataMap.getString("");

    }
}
