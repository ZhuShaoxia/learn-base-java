package com.ccsu.mybatis.dao;

import com.ccsu.mybatis.bean.Message;
import com.ccsu.mybatis.config.DBAccess;
import com.ccsu.mybatis.mapper.IMessage;
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
            Message message = null;
            String sql = "";
            sqlSession.selectList(sql);
            sqlSession.selectList("mapper 中的 id",message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }

        return null;
    }

    public List<Message> quertyMessageList(){
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            Message message = null;
            IMessage mapper = sqlSession.getMapper(IMessage.class);
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
        Class message = Message.class;
    }
}
