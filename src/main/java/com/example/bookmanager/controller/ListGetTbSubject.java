package com.example.bookmanager.controller;

import com.example.bookmanager.model.TbSubject;
import com.example.bookmanager.service.SubjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ListGetTbSubject
 *
 * @author dml
 * @date 2021/12/05 16:51
 */
@RestController
public class ListGetTbSubject {

    @Resource
    private SubjectService subjectService;

    @PostMapping("listGetSubject")
    public List<TbSubject> listGetSubject(){return subjectService.listGetSubject();}

}
