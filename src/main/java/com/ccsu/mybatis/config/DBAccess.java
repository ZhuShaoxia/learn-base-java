package com.ccsu.mybatis.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/27
 * @Time: 23:46
 * Description:
 */
public class DBAccess {
    public SqlSession getSqlSession() throws IOException {
        //通过配置文件获取数据库连接信息
        Reader resourceAsReader = Resources.getResourceAsReader("mybatis/configure.xml");
        //通过配置信息构建 SQLSessionFactory
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //通过 SQLSession 打开一个数据库会话
        SqlSession sqlSession = build.openSession();
        return sqlSession;
    }

}
