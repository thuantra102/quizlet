package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class GeneralEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    @Column(name = "timeCreated")
    @CreatedDate
    Date timeCreated;



}
