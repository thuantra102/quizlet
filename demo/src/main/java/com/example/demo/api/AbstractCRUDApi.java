package com.example.demo.api;



import com.example.demo.dto.GeneralDTO;
import com.example.demo.model.GeneralEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AbstractCRUDApi<ENTITY extends GeneralEntity, DTO extends GeneralDTO> {
    DTO save(DTO dto);
    DTO getById(Integer id);
    Page<DTO> list(Pageable pageable);
    boolean delete(Integer id);

}
