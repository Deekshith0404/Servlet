package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MuseumFormDto;
import com.xworks.formsexampl.dao.MuseumRepository;
import com.xworks.formsexampl.dao.MuseumRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class MuseumServiceImpl implements MuseumService{

    private MuseumRepository museumRepository=new MuseumRepositoryImpl();
    @Override
    public boolean save(MuseumFormDto museumFormDto) {
        System.out.println("saved");
        boolean result1=museumRepository.save(museumFormDto);
        return result1;
    }

    @Override
    public List<MuseumFormDto> getall() {
        List<MuseumFormDto> list=museumRepository.getall();
        return list;
    }
}
