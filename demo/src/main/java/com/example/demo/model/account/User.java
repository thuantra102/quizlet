package com.example.demo.model.account;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
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
    Long id;
    String userName;
    String password;
    String email;
    Date birthday;
    String tokenEmail;
    String tokenFacebook;
    Integer isDark;
    Integer level;
    @Column(name = "timeCreated")
    @CreatedDate
    Date timeCreated;

    public User(Long id) {
        this.id = id;
    }
}
