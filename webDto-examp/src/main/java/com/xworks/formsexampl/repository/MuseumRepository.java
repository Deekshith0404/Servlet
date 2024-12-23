package com.xworks.formsexampl.repository;

import com.xworks.formsexampl.dto.MuseumFormDto;

public interface MuseumRepository {
    boolean save(MuseumFormDto museumFormDto);
}
