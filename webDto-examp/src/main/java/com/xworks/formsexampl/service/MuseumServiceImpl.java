package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MuseumFormDto;

public class MuseumServiceImpl implements MuseumService{
    @Override
    public boolean save(MuseumFormDto museumFormDto) {
        System.out.println("saved");
        return true;
    }
}
