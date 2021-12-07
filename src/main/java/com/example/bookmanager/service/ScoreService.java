package com.example.bookmanager.service;

import com.example.bookmanager.model.TbScore;

import java.util.List;

/**
 * ScoreService
 *
 * @author dml
 * @date 2021/12/05 17:12
 */
public interface ScoreService {

    /**
     * get score list
     *
     * @return list
     */
    List<TbScore> listGetScore();

    /**
     * add score
     *
     * @param name name
     * @return int
     */
    int addScore(String score,Integer stuId,Integer subjectId);


}
