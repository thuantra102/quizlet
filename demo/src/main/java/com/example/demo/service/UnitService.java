package com.example.demo.service;

import com.example.demo.converter.AbstractDTOConverter;
import com.example.demo.dto.UnitDTO;
import com.example.demo.model.unit.DetailUnit;
import com.example.demo.model.unit.Unit;
import com.example.demo.repository.GeneralRepository;
import org.springframework.stereotype.Service;

@Service
public class UnitService extends AbstractCRUDService<Unit, UnitDTO> {
    public UnitService(GeneralRepository<Unit> repository, AbstractDTOConverter<Unit, UnitDTO> converter) {
        super(repository, converter);
    }

    @Override
    public Unit updateEntity(Unit unit, UnitDTO unitDTO) {
        return new Unit(unitDTO);
    }
}
