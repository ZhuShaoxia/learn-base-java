package com.ccsu.mybatis.example;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/12/31
 * @Time: 11:03
 * Description:
 */
public class test {

    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession();
        IMessage mapper = sqlSession.getMapper(IMessage.class);
        mapper.queryMessageList();
    }
}

