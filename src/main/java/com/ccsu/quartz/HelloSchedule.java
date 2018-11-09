package com.ccsu.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/6
 * @Time: 23:12
 * Description:
 */
public class HelloSchedule {
    public static void main(String[] args) throws SchedulerException {
        //创建一个 JobDetail 实例，将该实例与 helloJob Class 绑定
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob", "group1").build();
        //创建一个 Trigger 实例，定义 job 立即执行，并且每隔两秒重复执行一次(withSchedule)，直到永远
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1")
                .startNow().withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build();
        //创建 Scheduler 实例
        SchedulerFactory sFact = new StdSchedulerFactory();
        Scheduler scheduler = sFact.getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);

        //DEMO2
        SimpleTrigger simpleTrigger = (SimpleTrigger) TriggerBuilder.newTrigger()
                .withIdentity("","")
                .startAt(new Date())//指定什么时候开始
                //SimpleTrigger.REPEAT_INDEFINITELY 常量值 无穷
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(SimpleTrigger.REPEAT_INDEFINITELY))//指定循环调度方法
                .build();
    }
}
