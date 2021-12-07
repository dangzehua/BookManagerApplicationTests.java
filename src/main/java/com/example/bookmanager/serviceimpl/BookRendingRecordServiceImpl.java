package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.BookRendingRecordMapper;
import com.example.bookmanager.model.TbBookRendingRecord;
import com.example.bookmanager.service.BookRendingRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookRendingRecordServiceImpl implements BookRendingRecordService {

    @Resource
    private BookRendingRecordMapper bookRendingRecordMapper;

    @Override
    public List<TbBookRendingRecord> listGetBookRendingRecord() {
        return bookRendingRecordMapper.selectList(null);
    }
}
