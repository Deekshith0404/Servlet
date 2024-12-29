package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.SweetFormDto;

import java.util.List;

public interface SweetRepository {
    boolean save(SweetFormDto sweetFormDto);

    List<SweetFormDto> getAll();
}
