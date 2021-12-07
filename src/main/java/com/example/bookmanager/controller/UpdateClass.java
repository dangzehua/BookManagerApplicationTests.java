package com.example.bookmanager.controller;

import com.example.bookmanager.service.ClassService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * UpdateClass
 *
 * @author dml
 * @date 2021/12/05 18:32
 */
@RestController
public class UpdateClass {

    @Resource
    private ClassService classService;

    @PostMapping("updateClass")
    public int updateClass(String name, int id) {
        return classService.updateClass(name, id);
    }

}
