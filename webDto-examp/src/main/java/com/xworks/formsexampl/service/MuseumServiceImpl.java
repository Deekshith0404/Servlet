package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MuseumFormDto;
import com.xworks.formsexampl.repository.MuseumRepository;
import com.xworks.formsexampl.repository.MuseumRepositoryImpl;

public class MuseumServiceImpl implements MuseumService{

    private MuseumRepository museumRepository=new MuseumRepositoryImpl();
    @Override
    public boolean save(MuseumFormDto museumFormDto) {
        System.out.println("saved");
        boolean result1=museumRepository.save(museumFormDto);
        return result1;
    }
}
