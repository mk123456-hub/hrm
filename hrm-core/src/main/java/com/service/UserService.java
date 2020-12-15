package com.service;

import com.alibaba.fastjson.JSON;
import com.dao.UserDao;
import com.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Administrator
 * @create 2020/12/14 0014 21:36
 */
@Service(value = "userService")
public class UserService {
    @Autowired
    UserDao userDao;
    public String listJson(){
        List<User> userlist = userDao.list();
        return JSON.toJSONString(userlist);
    }

}
