package com.example.bookmanager.service;

import com.example.bookmanager.model.TbAdministrator;

import java.util.List;

public interface AdministratorService {

    /**
     * get administrator list
     *
     * @return list
     */
    List<TbAdministrator> listGetAdministrator();

}
