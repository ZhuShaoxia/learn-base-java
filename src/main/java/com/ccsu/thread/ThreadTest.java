package com.ccsu.thread;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/13
 * @Time: 16:07
 * Description:
 */
public class ThreadTest implements Runnable {
    private String name;

    public ThreadTest(String name) {
        this.name = name;
        System.out.println("my name is :name");
    }

    @Override
    public void run() {

    }

}
