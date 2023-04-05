package com.example.demo.dto;

import com.example.demo.model.GeneralEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.beans.Transient;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public  class GeneralDTO<E extends GeneralEntity> {
    private Integer id;
    private Date timeCreated;
    @Transient
    public boolean isNew() {
        return  id == null;
    }



}
