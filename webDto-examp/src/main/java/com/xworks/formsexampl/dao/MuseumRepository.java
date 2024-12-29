package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.MuseumFormDto;

import java.util.List;

public interface MuseumRepository {
    boolean save(MuseumFormDto museumFormDto);

    List<MuseumFormDto> getall();
}
