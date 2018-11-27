package com.ccsu.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: Xiaolei Zhu
 * Date: 2018-11-09
 * Time: 15:47
 * Email: mr.zhuxiaolei@gmail.com
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        Map map = new HashMap<>();
        map = new LinkedHashMap();
        List animals = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i ++){
            animals.add("cat:"+i);
        }
        Configuration config = new Configuration();
        map.put("name","zhuxiaolei");
        map.put("age","24");
        map.put("company","zjtlcb");
        config.setDefaultEncoding("UTF-8");
        config.setDirectoryForTemplateLoading(new File("D:\\project\\learn-base-java\\src\\main\\java\\com\\ccsu\\freemarker\\ftl"));
        Template template = config.getTemplate("hello.ftl");
        template.process(animals,new FileWriter("D:\\project\\learn-base-java\\src\\main\\java\\com\\ccsu\\freemarker\\bb.html"));
    }
}
