package com.example.bookmanager.service;

import com.example.bookmanager.model.TbStu;

import java.util.List;

/**
 * StuService
 *
 * @author dml
 * @date 2021/12/05 15:27
 */
public interface StuService {

    /**
     * get stu list
     *
     * @return list
     */
    List<TbStu> listGetStu();

    /**
     * add stu
     *
     * @param name name
     * @return int
     */
    int addStu(String name,Integer classId);

    /**
     * update stu
     *
     * @param name name
     * @param id id
     * @return int
     */
    int updateStu(String name,Integer id);

    int updateStu(String name, Integer classId, Integer id);
}
