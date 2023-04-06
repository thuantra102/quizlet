package com.example.demo.model.account;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String userName;
    String password;
    String email;
    Date birthday;
    String tokenEmail;
    String tokenFacebook;
    Integer isDark;
    Integer level;
    @Column(name = "timeCreated")
    @CreationTimestamp
    Date timeCreated;



    public User(Integer id) {
        this.id = id;
    }
}
