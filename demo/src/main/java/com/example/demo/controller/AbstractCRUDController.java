package com.example.demo.controller;

import com.example.demo.api.AbstractCRUDApi;

import com.example.demo.dto.GeneralDTO;
import com.example.demo.model.GeneralEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AbstractCRUDController<ENTITY extends GeneralEntity, DTO extends GeneralDTO> {

    private AbstractCRUDApi<ENTITY, DTO> api;

    public AbstractCRUDController(AbstractCRUDApi<ENTITY, DTO> api) {
        this.api = api;
    }



    @PostMapping
    public DTO save(@RequestBody DTO dto) {
        return api.save(dto);
    }

    @GetMapping("/{id}")
    public DTO getById(@PathVariable Integer id) {
        return api.getById(id);
    }

    @GetMapping("/list")
    public Page<DTO> list(@PageableDefault(size = 1) Pageable pageable) {
        return api.list(pageable);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Integer id) {
        return api.delete(id);
    }

}
