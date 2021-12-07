package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.ScoreMapper;
import com.example.bookmanager.model.TbScore;
import com.example.bookmanager.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ScoreServiceImpl
 *
 * @author dml
 * @date 2021/12/05 17:16
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public List<TbScore> listGetScore() {
        return scoreMapper.selectList(null);
    }

    @Override
    public int addScore(String score, Integer stuId, Integer subjectId) {
        TbScore tbScore = new TbScore();
        tbScore.setScore(score);
        tbScore.setStuId(stuId);
        tbScore.setSubjectId(subjectId);
        return scoreMapper.insert(tbScore);
    }
}
