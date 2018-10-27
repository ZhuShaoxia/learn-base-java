package com.ccsu.dataStructure.sort;

/**
 * Created with IntelliJ IDEA.
 * Description: 插入排序
 * Author: Xiaolei Zhu
 * Date: 2018-11-01
 * Time: 10:53
 * Email: mr.zhuxiaolei@gmail.com
 * url:https://time.geekbang.org/column/article/41802
 */
public class InsertionSort {

    /**
     * 插入排序 从前向后插入  从后向前比较
     *
     * @param a
     * @param n
     */
    // 插入排序，a 表示数组，n 表示数组大小
    public static void insertionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j + 1] = value; // 插入数据
        }
    }

    public static void main(String[] args) {
        int[] a ={4,5,6,1,3,2};
        InsertionSort.insertionSort(a,6);
        BubbleSort.printAll(a);
    }

}
