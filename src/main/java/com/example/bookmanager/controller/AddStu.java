package com.example.bookmanager.controller;

import com.example.bookmanager.service.StuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AddStu
 *
 * @author dml
 * @date 2021/12/05 18:06
 */
@RestController
public class AddStu {

    @Resource
    private StuService stuService;

    @PostMapping("addStu")
    public int addStu(String name,Integer classId){
        return stuService.addStu(name,classId);
    }
}
