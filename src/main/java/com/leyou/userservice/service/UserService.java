package com.leyou.userservice.service;

import com.leyou.userservice.mapper.UserMapper;
import com.leyou.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
