package com.yxh.restful.controller;

import com.yxh.restful.entity.UserTest;
import com.yxh.restful.server.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value="/hello")
    @ResponseBody
    public String test(){
        return userService.sayHi();
    }

    @RequestMapping(value = "/createUser", method = POST)
    @ResponseBody
    public Map<String, Object> saveUser() {
        int ret = userService.insert();
        Map<String, Object> map = new HashMap<String, Object>(3);
        map.put("result", ret);
        return map;
    }

    @RequestMapping(value = "/getUser", method = GET)
    @ResponseBody
    public List<UserTest> getUser() {
        List<UserTest> result = new ArrayList<UserTest>();
        result.add(userService.getUserByPrimaryKey());
        return result;
    }

    @RequestMapping(value = "/updateUser", method = PUT)
    @ResponseBody
    public Map<String, Object> updateUser() {
        int ret = userService.updateByPrimaryKey();
        Map<String, Object> map = new HashMap<String, Object>(3);
        map.put("result", ret);
        return map;
    }

    @RequestMapping(value = "/deleteUser", method = DELETE)
    @ResponseBody
    public Map<String, Object> deleteUser() {
        int ret = userService.deleteByPrimaryKey();
        Map<String, Object> map = new HashMap<String, Object>(3);
        map.put("result", ret);
        return map;
    }
}
