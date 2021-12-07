package com.example.bookmanager.serviceimpl;

import com.example.bookmanager.mapper.BookCategoryMapper;
import com.example.bookmanager.model.TbBookCategory;
import com.example.bookmanager.service.BookCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookCategoryServiceImpl implements BookCategoryService {

    @Resource
    private BookCategoryMapper bookCategoryMapper;

    @Override
    public List<TbBookCategory> listGetBookCategory() {
        return bookCategoryMapper.selectList(null);
    }
}
