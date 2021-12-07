package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.BookInformationMapper;
import com.example.bookmanager.model.TbBookInformation;
import com.example.bookmanager.service.BookInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookInformationServiceImpl implements BookInformationService {

    @Resource
    private BookInformationMapper bookInformationMapper;

    @Override
    public List<TbBookInformation> listGetBookInformation() {
        return bookInformationMapper.selectList(null);
    }
}
