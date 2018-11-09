package com.ccsu.base.timer;

import java.util.TimerTask;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/4
 * @Time: 21:15
 * Description: Java定时任务 Timer的学习
 */
public class TimerTaskTest extends TimerTask {
    private String name;
    private int count;

    public TimerTaskTest(String name) {
        this.name = name;
        this.count = 0;
    }


    @Override
    public void run() {
        ++count;
        System.out.println(count + " my name is:" + name);
        if (count == 5) {
            this.cancel();
            System.out.println("定时任务结束");
        }
    }


}
