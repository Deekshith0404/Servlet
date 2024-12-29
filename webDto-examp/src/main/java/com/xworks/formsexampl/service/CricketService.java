package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.CricketFormDto;

import java.util.List;

public interface CricketService {
    boolean save(CricketFormDto cricketFormDto);
    List<CricketFormDto> getall();
}
