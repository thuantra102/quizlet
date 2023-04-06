package com.example.demo.dto;

import com.example.demo.model.unit.Unit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UnitDTO extends GeneralDTO{
    private String nameUnit;
    private String descriptionUnit;
    private Integer idDisplayStatus;
    private Integer idEditStatus;
    private String topicName;
    private Long topicId;
    private String userName;
    private Integer idUser;

    public UnitDTO(Unit unit) {
        this.setId(unit.getId());
        this.setTimeCreated(unit.getTimeCreated());
        this.nameUnit = unit.getNameUnit();
        this.descriptionUnit = unit.getDescriptionUnit();
        this.idDisplayStatus = unit.getDisplayStatus().getId();
        this.idEditStatus = unit.getEditStatus().getId();
        this.topicName = unit.getTopic().getNameTopic();
        this.topicId = unit.getTopic().getId();
        this.userName = unit.getUser().getUserName();
    }
}
