package com.example.demo.converter;

import com.example.demo.dto.DetailUnitDTO;
import com.example.demo.model.unit.DetailUnit;
import org.springframework.stereotype.Component;

@Component
public class DetailUnitConverter implements AbstractDTOConverter<DetailUnit, DetailUnitDTO> {
    @Override
    public DetailUnitDTO convertDetail(DetailUnit detailUnit) {
        return new DetailUnitDTO(detailUnit);
    }
}
