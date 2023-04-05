package com.example.demo.model.unit;

import com.example.demo.dto.UnitDTO;
import com.example.demo.model.account.User;
import com.example.demo.model.GeneralEntity;
import com.example.demo.model.topic.Topic;
import lombok.*;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Unit extends GeneralEntity {
    String nameUnit;
    String descriptionUnit;
    String statusUnit;
    Integer editUnit;
    @ManyToOne
    @JoinColumn(name = "id_topic", nullable = false)
    Topic topic;
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    User user;

    public Unit(Integer unitId) {
        this.setId(unitId);
    }

    public Unit(UnitDTO unitDTO) {
        this.setId(unitDTO.getId());
        this.setTimeCreated(unitDTO.getTimeCreated());
        this.nameUnit = unitDTO.getNameUnit();
        this.descriptionUnit = unitDTO.getDescriptionUnit();
        this.statusUnit = unitDTO.getStatusUnit();
        this.editUnit = unitDTO.getEditUnit();
        this.topic = new Topic(unitDTO.getTopicId());
        this.user = new User(unitDTO.getIdUser());
    }
}
