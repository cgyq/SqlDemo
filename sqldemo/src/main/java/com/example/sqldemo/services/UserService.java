package com.example.sqldemo.services;

import com.example.sqldemo.domain.MiUserEntity;

public interface UserService {

    MiUserEntity findAllByLoginName(String loginname);

    MiUserEntity findByLoginName(String loginname);

}
