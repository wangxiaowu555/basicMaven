package com.lovo.spring.dao.impl;

import com.lovo.spring.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository(value = "userDao")
public class UserDaoImpl implements IUserDao {

    public String getUserName() {
        return "我是赵云";
    }

    public String getUserName2() {
        return "我是赵云2";
    }
}
