package com.example.bookmanager.service;

import com.example.bookmanager.model.TbUser;

import java.util.List;

public interface UserService {

    /**
     * get user list
     *
     * @return list
     */
    List<TbUser> listGetUser();
}
