package com.ccsu.dataStructure.sort;

/**
 * Created with IntelliJ IDEA.
 * Description:选择排序
 * Author: Xiaolei Zhu
 * Date: 2018-11-01
 * Time: 11:31
 * Email: mr.zhuxiaolei@gmail.com
 * url:https://time.geekbang.org/column/article/41802
 */
public class SelectionSort {
    public static void selectionSort(int[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            int minValue = a[i];
            int j = i + 1;
            for (; j < n - i; j++) {
                if (a[j] < minValue) {
                    minValue = a[j];
                    minIndex = j;
                }
            }
            if (minIndex==i)
                continue;
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1, 3, 2};
        SelectionSort.selectionSort(a, 6);
        BubbleSort.printAll(a);
    }
}
