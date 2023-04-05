package com.example.demo.converter;

import com.example.demo.api.AbstractCRUDApi;
import com.example.demo.dto.UnitDTO;
import com.example.demo.model.unit.Unit;
import org.springframework.stereotype.Component;

@Component
public class UnitConverter implements AbstractDTOConverter<Unit, UnitDTO> {
    @Override
    public UnitDTO convertDetail(Unit unit) {
        return new UnitDTO(unit);
    }
}
