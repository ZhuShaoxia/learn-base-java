package com.ccsu.dataStructure.sort;

/**
 * Created with IntelliJ IDEA.
 * Description: 冒泡排序算法的几种实现
 * Author: Xiaolei Zhu
 * Date: 2018-11-01
 * Time: 9:36
 * Email: mr.zhuxiaolei@gmail.com
 * url:https://time.geekbang.org/column/article/41802
 *
 */
public class BubbleSort {

    /**
     * 从小到大排序
     *
     * @param a
     * @param n
     */
    public static void bubbleSort1(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序，a 表示数组，n 表示数组大小
     * 增加判断是否冒泡循环提前结束
     * @param a
     * @param n
     */
    public void bubbleSort2(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j+1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    flag = true;  // 表示有数据交换
                }
            }
            if (!flag) break;  // 没有数据交换，提前退出
        }
    }


    public static void printAll(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 4, 1, 2, 6};
        BubbleSort.printAll(a);
        System.out.println("\n排序后");
        BubbleSort.bubbleSort1(a,6);
        BubbleSort.printAll(a);
    }
}
