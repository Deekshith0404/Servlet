package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.SweetFormDto;

public class SweetServiceImpl implements SweetService{
    @Override
    public boolean save(SweetFormDto sweetFormDto) {
        System.out.println("saved");
        return true;
    }
}
