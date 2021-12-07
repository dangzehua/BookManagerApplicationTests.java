package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.AdministratorMapper;
import com.example.bookmanager.model.TbAdministrator;
import com.example.bookmanager.service.AdministratorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Resource
    private AdministratorMapper administratorMapper;

    @Override
    public List<TbAdministrator> listGetAdministrator() {
        return administratorMapper.selectList(null);
    }
}
