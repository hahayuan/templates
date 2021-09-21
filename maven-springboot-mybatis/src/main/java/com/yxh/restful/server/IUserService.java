package com.yxh.restful.server;

import com.yxh.restful.entity.UserTest;

public interface IUserService {
    public String sayHi();
    public int insert();
    public UserTest getUserByPrimaryKey();
    public int updateByPrimaryKey();
    public int deleteByPrimaryKey();
}
