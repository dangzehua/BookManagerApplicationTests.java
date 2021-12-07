package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.StuMapper;
import com.example.bookmanager.model.TbClass;
import com.example.bookmanager.model.TbStu;
import com.example.bookmanager.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * StuServicelmpl
 *
 * @author dml
 * @date 2021/12/05 15:30
 */
@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuMapper stuMapper;


    @Override
    public List<TbStu> listGetStu() {
        return stuMapper.selectList(null);
    }

    @Override
    public int addStu(String name, Integer classId) {
        TbStu tbStu = new TbStu();
        tbStu.setName(name);
        tbStu.setClassId(classId);
        return stuMapper.insert(tbStu);
    }

    @Override
    public int updateStu(String name, Integer id) {
        TbStu tbStu = new TbStu();
        tbStu.setName(name);
        tbStu.setId(id);
        return stuMapper.insert(tbStu);
    }

    @Override
    public int updateStu(String name, Integer classId, Integer id) {
        TbStu tbStu = new TbStu();
        tbStu.setName(name);
        tbStu.setId(id);
        tbStu.setClassId(classId);
        return stuMapper.insert(tbStu);
    }

}


