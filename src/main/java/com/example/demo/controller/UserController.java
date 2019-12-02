package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.TblUserInf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserDao userDao;

    @RequestMapping("login")
    public String login(){
        TblUserInf byId = userDao.getById("11111111");
        logger.info("获取的名字:"+byId.getName());
        return byId.getName();
    }
}
