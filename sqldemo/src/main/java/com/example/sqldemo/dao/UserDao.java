package com.example.sqldemo.dao;

import com.example.sqldemo.domain.MiRightEntity;
import com.example.sqldemo.domain.MiUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<MiUserEntity,String> {

    MiUserEntity findAllByLoginName(String loginname);

    MiUserEntity findByLoginName(String loginname);

}
