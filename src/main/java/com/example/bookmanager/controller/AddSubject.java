package com.example.bookmanager.controller;

import com.example.bookmanager.service.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AddSubject
 *
 * @author dml
 * @date 2021/12/05 17:46
 */
@RestController
public class AddSubject {

    @Resource
    private SubjectService subjectService;

    @PostMapping("addSubject")
    public int addSubject(String name){
        return subjectService.addSubject(name);
    }

}
