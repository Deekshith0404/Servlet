package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MuseumFormDto;

import java.util.List;

public interface MuseumService {
    public boolean save(MuseumFormDto museumFormDto);

    List<MuseumFormDto> getall();
}
