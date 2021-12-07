package com.example.bookmanager.controller;

import com.example.bookmanager.service.StuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UpdateStu {

    @Resource
    private StuService stuService;

    @PostMapping("updateStu")
    public int updateStu(String name,int classId,int id){return stuService.updateStu(name,classId,id);}
}
