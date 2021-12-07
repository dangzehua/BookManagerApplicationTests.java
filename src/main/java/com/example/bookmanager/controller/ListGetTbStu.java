package com.example.bookmanager.controller;

import com.example.bookmanager.model.TbStu;
import com.example.bookmanager.service.StuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ListGetTbStu
 *
 * @author dml
 * @date 2021/12/05 15:43
 */
@RestController
public class ListGetTbStu {

    @Resource
    private StuService stuService;

    @PostMapping("listGetStu")
    public List<TbStu> listGetStu() {
        return stuService.listGetStu();
    }

}
