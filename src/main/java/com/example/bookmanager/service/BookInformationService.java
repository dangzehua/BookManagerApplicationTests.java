package com.example.bookmanager.service;

import com.example.bookmanager.model.TbBookInformation;

import java.util.List;

public interface BookInformationService {

    /**
     * get bookInformation list
     *
     * @return list
     */
    List<TbBookInformation> listGetBookInformation();
}
