package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.SweetFormDto;
import com.xworks.formsexampl.dao.SweetRepository;
import com.xworks.formsexampl.dao.SweetRepositoryImpl;

import java.util.List;

public class SweetServiceImpl implements SweetService{

    private SweetRepository sweetRepository=new SweetRepositoryImpl();
    @Override
    public boolean save(SweetFormDto sweetFormDto) {
        System.out.println("saved");
        boolean result=sweetRepository.save(sweetFormDto);
        return result;
    }

    @Override
    public List<SweetFormDto> getAll() {
        List<SweetFormDto> list=sweetRepository.getAll();
        return list;
    }


}
