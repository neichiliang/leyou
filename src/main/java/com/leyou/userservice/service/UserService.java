package com.leyou.userservice.service;

import com.leyou.userservice.mapper.UserMapper;
import com.leyou.userservice.pojo.User;
import com.leyou.userservice.pojo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: user-service-demo
 * @description:
 * @author: zxb
 * @create: 2020-05-19 14:23
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserDao userDao;


    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public List<User> queryUserByIds(List<Long> ids) {
        List<User> users = new ArrayList<>();
        for (Long id : ids) {
            User user = this.userDao.queryUserById(id);
            users.add(user);
        }
        return users;
    }
}
