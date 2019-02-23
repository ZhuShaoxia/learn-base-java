package com.ccsu.mybatis.page.interceptor;

import com.ccsu.mybatis.page.Page;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/19
 * @Time: 19:24
 * Description: 1. 实现 接口
 *              2. 注解
 */
@Intercepts({@Signature(type = StatementHandler.class,method = "prepare",args = Connection.class)})
public class PageInterceptor implements Interceptor{
    //最后执行
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        // 需要什么东西：原始的SQL语句 ；配置的参数
        // invocation 被拦截的对象
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        // 根据 id 名字来判断是否需要拦截,然后通过封装的动态代理 获取 mapperedStatement
        MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY);
        MappedStatement mappedStatement  = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
        String id = mappedStatement.getId();
        if (id.matches(".+ByPage$")){
            BoundSql boundSql = statementHandler.getBoundSql();
            //原始SQL语句
            String sql = boundSql.getSql();
            //查询总条数的SQL语句
            String countSql = "select count(*) from (" + sql + ") a ";
            Connection connection = (Connection) invocation.getArgs()[0];
            connection.prepareStatement(countSql);
            Map<String,Object> map = (Map<String, Object>) boundSql.getParameterMappings();
            //获取分页参数
            Page page = (Page) map.get("page");
            int index ,endIndex;
            String pageSql = sql + "limit ";
            //修改原有SQL
            metaObject.setValue("delegate.boundSql.sql",pageSql);
        }
        return invocation.proceed();
    }

    //再执行
    @Override
    public Object plugin(Object target) {
        // 通过注解 生成代理类
        return Plugin.wrap(target,this);
    }

    //先执行 获取 xml 中配置的参数
    @Override
    public void setProperties(Properties properties) {
        String param = properties.getProperty("param");
    }
}
