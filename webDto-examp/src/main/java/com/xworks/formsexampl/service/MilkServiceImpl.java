package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MilkFormDto;
import com.xworks.formsexampl.dao.MilkRepository;
import com.xworks.formsexampl.dao.MilkRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class MilkServiceImpl implements MilkService{
    private MilkRepository milkRepository=new MilkRepositoryImpl();

    @Override
    public boolean save(MilkFormDto milkFormDto) {
        System.out.println("saved");
        boolean result=milkRepository.save(milkFormDto);
        return result;
    }

    @Override
    public List<MilkFormDto> getall() {
        List<MilkFormDto> list=milkRepository.getall();
        return  list;
    }
}
