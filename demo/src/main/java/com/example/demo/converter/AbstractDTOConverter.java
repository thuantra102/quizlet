package com.example.demo.converter;

import com.example.demo.dto.GeneralDTO;
import com.example.demo.model.GeneralEntity;

public interface AbstractDTOConverter<ENTITY extends GeneralEntity, DTO extends GeneralDTO> {
    public DTO convertDetail(ENTITY entity);
}
