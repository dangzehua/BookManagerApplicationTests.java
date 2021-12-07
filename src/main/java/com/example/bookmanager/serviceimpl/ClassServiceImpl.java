package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.ClassMapper;
import com.example.bookmanager.model.TbClass;
import com.example.bookmanager.service.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassServiceImpl
 *
 * @author dml
 * @date 2021/12/05 14:52
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Resource
    private ClassMapper classMapper;

    @Override
    public List<TbClass> listGetClass() {
        return classMapper.selectList(null);
    }

    @Override
    public int addClass(String name) {
        TbClass tbClass = new TbClass();
        tbClass.setName(name);
        return classMapper.insert(tbClass);
    }

    @Override
    public int updateClass(String name, int id) {
        TbClass tbClass = new TbClass();
        tbClass.setName(name);
        tbClass.setId(id);
        return classMapper.updateById(tbClass);
    }

    @Override
    public int deleteClass(int id) {
        return classMapper.deleteById(id);
    }
}
