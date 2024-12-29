package com.xworks.formsexampl.service;

import com.xworks.formsexampl.dto.MilkFormDto;

import java.util.List;

public interface MilkService {
    boolean save(MilkFormDto milkFormDto);

    List<MilkFormDto> getall();
}
