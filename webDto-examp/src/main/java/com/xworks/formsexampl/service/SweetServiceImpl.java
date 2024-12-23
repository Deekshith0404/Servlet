package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.SweetFormDto;
import com.xworks.formsexampl.repository.SweetRepository;
import com.xworks.formsexampl.repository.SweetRepositoryImpl;

public class SweetServiceImpl implements SweetService{

    private SweetRepository sweetRepository=new SweetRepositoryImpl();
    @Override
    public boolean save(SweetFormDto sweetFormDto) {
        System.out.println("saved");
        boolean result=sweetRepository.save(sweetFormDto);
        return result;
    }
}
