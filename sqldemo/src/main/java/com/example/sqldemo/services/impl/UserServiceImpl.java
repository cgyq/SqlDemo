package com.example.sqldemo.services.impl;

import com.example.sqldemo.dao.UserDao;
import com.example.sqldemo.domain.MiUserEntity;
import com.example.sqldemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public MiUserEntity findAllByLoginName(String loginname){
        return userDao.findAllByLoginName(loginname);

    }

    @Override
    public MiUserEntity findByLoginName(String loginname){
        return userDao.findByLoginName(loginname);
    }

}
