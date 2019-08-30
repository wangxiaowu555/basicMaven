package com.lovo.spring.service.impl;

import com.lovo.spring.dao.IUserDao;
import com.lovo.spring.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

   @Autowired
    private IUserDao userDao;

    public String getUserName() {
        return userDao.getUserName();
    }
    public String getUserName2() {
        return userDao.getUserName2();
    }
}
