package com.xworks.formsexampl.repository;

import com.xworks.formsexampl.dto.CricketFormDto;

public interface CricketRepository {
    boolean save(CricketFormDto cricketFormDto);
}
