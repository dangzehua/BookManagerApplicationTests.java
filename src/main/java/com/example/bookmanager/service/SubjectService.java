package com.example.bookmanager.service;

import com.example.bookmanager.model.TbSubject;

import java.util.List;

/**
 * SubjectService
 *
 * @author dml
 * @date 2021/12/05 16:25
 */
public interface SubjectService {

    /**
     * get subject list
     *
     * @return list
     */
    List<TbSubject> listGetSubject();

    /**
     *add subject
     *
     * @param name name
     * @return int
     */
    int addSubject(String name);

    /**
     * update subject
     *
     * @param name name
     * @param id id
     * @return int
     */
    int updateSubject(String name,int id);

    /**
     * delete subject
     *
     * @param id id
     * @return int
     */
    int deleteSubject(int id);
}
