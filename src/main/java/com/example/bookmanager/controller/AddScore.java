package com.example.bookmanager.controller;

import com.example.bookmanager.service.ScoreService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * AddScore
 *
 * @author dml
 * @date 2021/12/05 18:20
 */
@RestController
public class AddScore {

    @Resource
    private ScoreService scoreService;

    @PostMapping("addScore")
    public int addScore(String score, Integer stuId, Integer subjectId){
        return scoreService.addScore(score,stuId,subjectId);
    }
}
