package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.CricketFormDto;

import java.util.List;

public interface CricketRepository {
    boolean save(CricketFormDto cricketFormDto);

    List<CricketFormDto> getAll();
}
