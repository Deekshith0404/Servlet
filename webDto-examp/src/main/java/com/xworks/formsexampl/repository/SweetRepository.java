package com.xworks.formsexampl.repository;

import com.xworks.formsexampl.dto.SweetFormDto;

public interface SweetRepository {
    boolean save(SweetFormDto sweetFormDto);
}
