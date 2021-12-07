package com.example.bookmanager.controller;

import com.example.bookmanager.model.TbClass;
import com.example.bookmanager.service.ClassService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ListGetTbClass
 *
 * @author dml
 * @date 2021/12/05 14:54
 */
@RestController
public class ListGetTbClass {

    @Resource
    private ClassService classService;

    @PostMapping("listGetClass")
    public List<TbClass> listGetClass() {
        return classService.listGetClass();
    }

}
