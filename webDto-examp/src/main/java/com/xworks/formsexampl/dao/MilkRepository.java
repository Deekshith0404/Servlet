package com.xworks.formsexampl.dao;

import com.xworks.formsexampl.dto.MilkFormDto;

import java.util.List;

public interface MilkRepository {
    boolean save(MilkFormDto milkFormDto);

    List<MilkFormDto> getall();
}
