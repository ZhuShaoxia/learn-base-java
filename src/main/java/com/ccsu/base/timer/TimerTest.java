package com.ccsu.base.timer;

import java.util.Timer;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/4
 * @Time: 21:17
 * Description: delay:延时  period:周期  单位是毫秒
 * 1000 毫秒 = 1 秒
 */
public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTaskTest timerTaskTest = new TimerTaskTest("zhuxiaolei");
        //1.
        timer.schedule(timerTaskTest, 10L, 1000L);

        //2. 最近发生此任务执行安排的时间
        //timerTaskTest.scheduledExecutionTime();
    }
}
