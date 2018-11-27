package com.ccsu.dataStructure;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Xiaolei Zhu
 * Date: 2018-11-04
 * Time: 9:44
 * Email: mr.zhuxiaolei@gmail.com
 */
public class test {

    public int calculateWindPower(int value) {
        if (value < 74) {
            return 0;
        } else if (value <= 95) {
            return 1;
        } else if (value >= 131 && value <= 154) {
            return 4;
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {

    }
}
