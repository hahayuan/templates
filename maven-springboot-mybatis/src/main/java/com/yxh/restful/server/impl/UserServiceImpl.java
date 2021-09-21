package com.yxh.restful.server.impl;

import com.yxh.restful.dao.UserTestMapper;
import com.yxh.restful.entity.UserTest;
import com.yxh.restful.server.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserTestMapper userMapper;

    @Override
    public String sayHi() {
        return "Hello world!";
    }

    @Override
    public int insert() {
        UserTest user = new UserTest();
        user.setId(1);
        user.setName("牛皮plus");
        user.setSex("男");
        return userMapper.insert(user);
    }

    @Override
    public UserTest getUserByPrimaryKey() {
        return userMapper.selectByPrimaryKey(1);
    }

    @Override
    public int updateByPrimaryKey() {
        UserTest user = new UserTest();
        user.setId(1);
        user.setName("王二麻子");
        user.setSex("女");
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int deleteByPrimaryKey() {
        return userMapper.deleteByPrimaryKey(1);
    }
}
