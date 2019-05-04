package com.ccsu.thread;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/13
 * @Time: 16:11
 * Description:
 */
public class ThreadTest1 extends Thread {
    private String name ;

    public ThreadTest1(String name) {
        this.name = name;
    }
    public void run (){
        for (int i = 0 ; i < 100 ; i ++){
            System.out.println(name + "  ----  " + i );
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1("A");
        ThreadTest1 threadTest2 =new ThreadTest1("B");
        ThreadTest1 threadTest3 =new ThreadTest1("c");
        ThreadTest1 threadTest4 =new ThreadTest1("d");
        ThreadTest1 threadTest5 =new ThreadTest1("e");
        ThreadTest1 threadTest6 =new ThreadTest1("f");
        threadTest1.start();
        threadTest2.start();
        threadTest3.start();
        threadTest4.start();
        threadTest5.start();
        threadTest6.start();
    }
}
