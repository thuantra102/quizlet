package com.example.demo.model.unit;

import com.example.demo.dto.DetailUnitDTO;
import com.example.demo.model.GeneralEntity;
import lombok.*;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailUnit extends GeneralEntity {
    String term;
    String definition;
    String image;
    @ManyToOne
    @JoinColumn(name = "id_unit" , nullable = false)
    Unit unit;


    public DetailUnit(DetailUnitDTO detailUnitDTO) {
        this.setId(detailUnitDTO.getId());
        this.setTimeCreated(detailUnitDTO.getTimeCreated());
        this.term = detailUnitDTO.getTerm();
        this.definition = detailUnitDTO.getDefinition();
        this.image = detailUnitDTO.getImage();
        this.unit = new Unit(detailUnitDTO.getUnitId());

    }
}
