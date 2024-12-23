package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.CricketFormDto;
import com.xworks.formsexampl.repository.CricketRepository;
import com.xworks.formsexampl.repository.CricketRepositoryImpl;

public class CricketServiceImpl implements CricketService{
    private CricketRepository cricketRepository=new CricketRepositoryImpl();
    @Override
    public boolean save(CricketFormDto cricketFormDto) {
        boolean result=cricketRepository.save(cricketFormDto);
        return result;
    }
}
