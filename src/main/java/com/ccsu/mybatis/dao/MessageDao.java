package com.ccsu.mybatis.dao;

import com.ccsu.mybatis.bean.Message;
import com.ccsu.mybatis.config.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/11/27
 * @Time: 23:50
 * Description:
 */
public class MessageDao {

    public List<Message> queryMessageList(String command, String description) {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            String sql = "";
            final List<Object> objects = sqlSession.selectList(sql);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        MessageDao messageDao = new MessageDao();
        messageDao.queryMessageList("","");
    }
}
