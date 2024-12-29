package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.CricketFormDto;
import com.xworks.formsexampl.dao.CricketRepository;
import com.xworks.formsexampl.dao.CricketRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class CricketServiceImpl implements CricketService{
    private CricketRepository cricketRepository=new CricketRepositoryImpl();
    @Override
    public boolean save(CricketFormDto cricketFormDto) {
        boolean result=cricketRepository.save(cricketFormDto);
        return result;
    }

    @Override
    public List<CricketFormDto> getall() {
        List<CricketFormDto> list= cricketRepository.getAll();
        return list;
    }
}
