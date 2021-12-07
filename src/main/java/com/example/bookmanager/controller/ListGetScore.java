package com.example.bookmanager.controller;

import com.example.bookmanager.model.TbScore;
import com.example.bookmanager.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ListGetScore
 *
 * @author dml
 * @date 2021/12/05 17:19
 */
@RestController
public class ListGetScore {

    @Resource
    private ScoreService scoreService;

    @PostMapping("listGetScore")
    public List<TbScore> listGetScore(){return scoreService.listGetScore();}
}
