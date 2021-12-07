package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.SubjectMapper;
import com.example.bookmanager.model.TbSubject;
import com.example.bookmanager.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * SubjectServiceImpl
 *
 * @author dml
 * @date 2021/12/05 16:30
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Resource
    private SubjectMapper subjectMapper;

    @Override
    public List<TbSubject> listGetSubject() {
        return subjectMapper.selectList(null);
    }

    @Override
    public int addSubject(String name) {
        TbSubject tbSubject = new TbSubject();
        tbSubject.setName(name);
        return subjectMapper.insert(tbSubject);
    }

    @Override
    public int updateSubject(String name, int id) {
        TbSubject tbSubject = new TbSubject();
        tbSubject.setName(name);
        tbSubject.setId(id);
        return subjectMapper.updateById(tbSubject);
    }

    @Override
    public int deleteSubject(int id) {
        return subjectMapper.deleteById(id);
    }


}
