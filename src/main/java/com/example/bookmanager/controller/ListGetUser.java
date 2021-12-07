package com.example.bookmanager.controller;

import com.example.bookmanager.model.TbUser;
import com.example.bookmanager.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ListGetUser {

    @Resource
    private UserService userService;

    @PostMapping("listGetUser")
    public List<TbUser> listGetUser() { return userService.listGetUser();}
}
