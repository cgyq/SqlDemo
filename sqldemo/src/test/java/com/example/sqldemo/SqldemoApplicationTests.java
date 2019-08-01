package com.example.sqldemo;

import com.example.sqldemo.dao.UserDao;
import com.example.sqldemo.domain.MiUserEntity;
import com.example.sqldemo.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqldemoApplicationTests {

    @Test
    public void contextLoads() {
    }

//    @Autowired
//    UserDao userDao;
//
//    @Test
//    public void testFindByLoginname01(){
//        MiUserEntity miUserEntity = userDao.findAllByLoginName("zhangsan");
//        System.out.println("password:" + miUserEntity.getPassword());
//        System.out.println("name:" + miUserEntity.getName());
//        System.out.println("phone:" + miUserEntity.getPhone());
//    }

    @Autowired
    UserService userService;

    @Test
    public void testFindByLoginname(){
        MiUserEntity miUserEntity = userService.findAllByLoginName("zhangsan");
        System.out.println("password:" + miUserEntity.getPassword());
    }
}
