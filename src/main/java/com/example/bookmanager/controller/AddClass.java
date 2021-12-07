package com.example.bookmanager.controller;

import com.example.bookmanager.service.ClassService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AddClass
 *
 * @author dml
 * @date 2021/12/05 17:34
 */
@RestController
public class AddClass {

    @Resource
    private ClassService classService;

    @PostMapping("addClass")
    public int addClass(String name) {
        return classService.addClass(name);
    }

}
