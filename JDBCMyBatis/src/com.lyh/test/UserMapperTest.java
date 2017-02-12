package com.lyh.test;

import com.lyh.dao.Mapper;
import com.lyh.dao.UserMapper;
import com.lyh.dao.impl.PerpetualCache;
import com.lyh.dto.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Created by galaxy on 2017/1/7.
 */
public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    //注解Before是在执行本类所有测试方法之前先调用这个方法
    @Before
    public void setup() throws Exception {
        //创建SqlSessionFactory
        String resource = "SqlMapConfig.xml";

        //将配置文件加载成流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis配置文件的信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindUserById() throws Exception {
        //sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper代理对象
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        sqlSession.clearCache();
        //调用userMapper的方法
        User user1 = mapper.findUserById(1);

        PerpetualCache perpetualCache = new PerpetualCache();
        perpetualCache.putObject(user1.getUsername(), user1);
        System.out.println("perpetualCache" + perpetualCache.getObject("王五"));

        User user2 = mapper.findUserById(1);

        sqlSession.clearCache();
        sqlSession.commit();
        System.out.println("user2" + user2);

    }



    @Test
    public void testFindUserListByName() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //调用userMapper的方法
        User userCustom = new User();
        // user.setSex();
        userCustom.setUsername("ggg");
        List<User> userList = userMapper.findUserByName(userCustom);
        System.out.println(userList.size());
    }

    @Test
    public void testInsertUser() throws Exception {
        //sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //创建UserMapper代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //调用userMapper的方法
        User user = new User();
        user.setAddress("huhhu");
        user.setBirthday(new Date());
        user.setSex("hsj");
        user.setUsername("ggg");

        userMapper.insertUser(user);

//下面的操作一定不要忽略不然虽然执行不会不错但是数据库没有插入成功
        sqlSession.commit();
        System.out.println(user.getUsername());
    }
}
