package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.BookReturnRecordMapper;
import com.example.bookmanager.model.TbBookReturnRecord;
import com.example.bookmanager.service.BookReturnRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookReturnRecordServiceImpl implements BookReturnRecordService {

    @Resource
    private BookReturnRecordMapper bookReturnRecordMapper;

    @Override
    public List<TbBookReturnRecord> listGetBookReturnRecord() {
        return bookReturnRecordMapper.selectList(null);
    }
}
