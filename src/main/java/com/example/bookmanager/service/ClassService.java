package com.example.bookmanager.service;

import com.example.bookmanager.model.TbClass;

import java.util.List;

/**
 * ClassService
 *
 * @author dml
 * @date 2021/12/05 14:52
 */
public interface ClassService {

    /**
     * get class list
     *
     * @return  list
     */
    List<TbClass> listGetClass();

    /**
     * add class
     *
     * @param name  name
     * @return  int
     */
    int addClass(String name);

    /**
     * update class
     *
     * @param name  name
     * @param id  id
     * @return  int
     */
    int updateClass(String name, int id);

    /**
     * delete class
     *
     * @param id id
     * @return  int
     */
    int deleteClass(int id);

}
