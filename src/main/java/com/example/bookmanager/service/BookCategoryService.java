package com.example.bookmanager.service;

import com.example.bookmanager.model.TbBookCategory;

import java.util.List;

public interface BookCategoryService {

    /**
     * get bookCategory list
     *
     * @return list
     */
    List<TbBookCategory> listGetBookCategory();
}
