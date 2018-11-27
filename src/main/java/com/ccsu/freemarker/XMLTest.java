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
 * Date: 2018-11-12
 * Time: 16:51
 * Email: mr.zhuxiaolei@gmail.com
 */
public class XMLTest {
    public static void main(String[] args) throws IOException, TemplateException {
        List<Map<String,String>> fields = new ArrayList<>();
        Map<String,String> map = new LinkedHashMap<>();
        Configuration config = new Configuration();
        map.put("name","zhuxiaolei");
        map.put("label","24");
        map.put("type","zjtlcb");
        map.put("length","52");
        fields.add(map);
        fields.add(map);
        config.setDefaultEncoding("UTF-8");
        config.setDirectoryForTemplateLoading(new File("D:\\project\\learn-base-java\\src\\main\\java\\com\\ccsu\\freemarker\\ftl"));
        Template template = config.getTemplate("xml.ftl");
        template.process(map,new FileWriter("D:\\project\\learn-base-java\\src\\main\\java\\com\\ccsu\\freemarker\\bb.html"));
    }
}
