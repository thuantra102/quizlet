package com.example.demo.controller;

import com.example.demo.api.AbstractCRUDApi;
import com.example.demo.dto.DetailUnitDTO;
import com.example.demo.model.unit.DetailUnit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/detailUnit")
public class DetailUnitController extends AbstractCRUDController<DetailUnit, DetailUnitDTO> {
    public DetailUnitController(AbstractCRUDApi<DetailUnit, DetailUnitDTO> api) {
        super(api);
    }
}
