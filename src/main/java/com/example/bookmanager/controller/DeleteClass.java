package com.example.bookmanager.controller;

import com.example.bookmanager.service.ClassService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * DeleteClass
 *
 * @author dml
 * @date 2021/12/05 18:33
 */
@RestController
public class DeleteClass {

    @Resource
    private ClassService classService;

    @PostMapping("deleteClass")
    public int deleteClass(int id) {
        return classService.deleteClass(id);
    }

}
