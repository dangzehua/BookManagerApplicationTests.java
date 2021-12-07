package com.example.bookmanager.service;

import com.example.bookmanager.model.TbBookRendingRecord;

import java.util.List;

public interface BookRendingRecordService {

    /**
     * get bookRendingRecord list
     *
     * @return list
     */
    List<TbBookRendingRecord> listGetBookRendingRecord();
}
