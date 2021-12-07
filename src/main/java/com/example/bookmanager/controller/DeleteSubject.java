package com.example.bookmanager.controller;

import com.example.bookmanager.service.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DeleteSubject
 *
 * @author dml
 * @date 2021/12/05 18:48
 */
@RestController
public class DeleteSubject {

    @Resource
    private SubjectService subjectService;

    @PostMapping("deleteSubject")
    public int deleteSubject(int id){
        return subjectService.deleteSubject(id);
    }
}
