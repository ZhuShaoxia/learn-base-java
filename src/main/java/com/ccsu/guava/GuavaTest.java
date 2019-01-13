package com.ccsu.guava;


import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/12/8
 * @Time: 18:14
 * Description:
 */
public class GuavaTest {
    public static void main(String[] args) {
        // 1. 判断是否为空
        String str = "zhuxiaolei";
        if (Strings.isNullOrEmpty(str)){

        }
        //2. 判断是否大于零
        int count = 0 ;
        Preconditions.checkArgument(count > 0, "must be positive: %s", count);

        //3.
        List<String> list = Lists.newArrayList();
        Map<String, Map<Long,String>> mapMap = Maps.newHashMap();

        //4.
        int a = 0 ;
        int b = 0;

        Ints.compare(a,b);
    }
}
