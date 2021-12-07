package com.example.bookmanager.controller;

import com.example.bookmanager.service.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * UpdateSubject
 *
 * @author dml
 * @date 2021/12/05 18:45
 */
@RestController
public class UpdateSubject {

    @Resource
    private SubjectService subjectService;

    @PostMapping("updateSubject")
    public int updateSubject(String name,int id){
        return subjectService.updateSubject(name,id);
    }
}
