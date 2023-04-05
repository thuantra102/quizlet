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
    private String statusUnit;
    private Integer editUnit;
    private String topicName;
    private Long topicId;
    private String userName;
    private Long idUser;

    public UnitDTO(Unit unit) {
        this.setId(unit.getId());
        this.setTimeCreated(unit.getTimeCreated());
        this.nameUnit = unit.getNameUnit();
        this.descriptionUnit = unit.getDescriptionUnit();
        this.statusUnit = unit.getStatusUnit();
        this.editUnit = unit.getEditUnit();
        this.topicName = unit.getTopic().getNameTopic();
        this.topicId = unit.getTopic().getId();
        this.userName = unit.getUser().getUserName();
    }
}
