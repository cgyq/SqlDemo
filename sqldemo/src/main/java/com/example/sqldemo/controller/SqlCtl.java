package com.example.sqldemo.controller;

import com.example.sqldemo.dao.UserDao;
import com.example.sqldemo.domain.MiUserEntity;
import com.example.sqldemo.services.UserService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SqlCtl {

    @Autowired
    UserDao userDao;

    @RequestMapping("/selectall")
    public List<MiUserEntity> selectall(ModelMap modelMap){
        return userDao.findAll();

    }

    @Autowired
    UserService userService;

    @RequestMapping("/select")
    public MiUserEntity select(ModelMap modelMap){
        return userService.findAllByLoginName("zhangsan");
    }
}
