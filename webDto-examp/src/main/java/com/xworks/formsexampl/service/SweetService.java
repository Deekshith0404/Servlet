package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.SweetFormDto;

import java.util.List;

public interface SweetService {
    public boolean save(SweetFormDto sweetFormDto);
    List<SweetFormDto> getAll();
}
