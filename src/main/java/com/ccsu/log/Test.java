package com.ccsu.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Xiaolei Zhu
 * Date: 2018-12-04
 * Time: 16:47
 * Email: mr.zhuxiaolei@gmail.com
 *
 * 日志测试
 */
public class Test {
        private static final Logger logger = LoggerFactory.getLogger(Test.class);
        public static void main(String[] args) {
            logger.info("Method:Hello");
            logger.info("World");
            logger.debug("123");
            logger.error("error");
        }
}
