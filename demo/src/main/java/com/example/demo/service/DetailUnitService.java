package com.example.demo.service;

import com.example.demo.converter.AbstractDTOConverter;
import com.example.demo.dto.DetailUnitDTO;
import com.example.demo.dto.UnitDTO;
import com.example.demo.model.unit.DetailUnit;
import com.example.demo.model.unit.Unit;
import com.example.demo.repository.GeneralRepository;
import org.springframework.stereotype.Service;

@Service
public class DetailUnitService extends AbstractCRUDService<DetailUnit, DetailUnitDTO> {

    public DetailUnitService(GeneralRepository<DetailUnit> repository, AbstractDTOConverter<DetailUnit, DetailUnitDTO> converter) {
        super(repository, converter);
    }

    @Override
    public DetailUnit updateEntity(DetailUnit entity, DetailUnitDTO dto) {
        return new DetailUnit(dto);
    }
}
