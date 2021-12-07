package com.example.bookmanager.service;

import com.example.bookmanager.model.TbBookReturnRecord;

import java.util.List;

public interface BookReturnRecordService {

    /**
     * get bookReturnRecord list
     *
     * @return list
     */
    List<TbBookReturnRecord> listGetBookReturnRecord();
}
