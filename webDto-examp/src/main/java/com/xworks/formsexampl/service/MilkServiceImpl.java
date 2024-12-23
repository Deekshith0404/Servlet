package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MilkFormDto;
import com.xworks.formsexampl.repository.MilkRepository;
import com.xworks.formsexampl.repository.MilkRepositoryImpl;

public class MilkServiceImpl implements MilkService{
    private MilkRepository milkRepository=new MilkRepositoryImpl();

    @Override
    public boolean save(MilkFormDto milkFormDto) {
        System.out.println("saved");
        boolean result=milkRepository.save(milkFormDto);
        return result;
    }
}
