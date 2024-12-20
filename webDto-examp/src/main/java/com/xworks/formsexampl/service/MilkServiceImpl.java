package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MilkFormDto;

public class MilkServiceImpl implements MilkService{
    @Override
    public boolean save(MilkFormDto milkFormDto) {
        System.out.println("saved");
        return true;
    }
}
