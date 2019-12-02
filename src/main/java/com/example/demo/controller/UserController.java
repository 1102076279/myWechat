package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.TblUserInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liwenjie
 * @Description:
 * @date: Create in 2019/12/2 16:23
 * @Modified By:
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("login")
    public String login(){
        TblUserInf byId = userDao.getById("11111111");
        return byId.getName();
    }
}
