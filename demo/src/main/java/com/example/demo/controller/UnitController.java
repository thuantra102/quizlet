package com.example.demo.controller;

import com.example.demo.api.AbstractCRUDApi;
import com.example.demo.dto.UnitDTO;
import com.example.demo.model.unit.Unit;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unit")
public class UnitController extends AbstractCRUDController<Unit, UnitDTO> {
    public UnitController(AbstractCRUDApi<Unit, UnitDTO> api) {
        super(api);
    }
}
