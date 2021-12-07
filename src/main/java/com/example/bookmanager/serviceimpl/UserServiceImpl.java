package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.UserMapper;
import com.example.bookmanager.model.TbUser;
import com.example.bookmanager.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<TbUser> listGetUser() {
        return userMapper.selectList(null);
    }
}
