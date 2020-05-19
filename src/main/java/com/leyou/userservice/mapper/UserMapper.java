package com.leyou.userservice.mapper;

import com.leyou.userservice.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: user-service-demo
 * @description:
 * @author: ncl
 * @create: 2020-05-19 14:23
 **/
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
