package com.example.demo.model.account;

import com.example.demo.dto.UserDTO;
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
    String username;
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

    public User(UserDTO userDTO) {
        this.username = userDTO.getUserName();
        this.password = userDTO.getPassWord();
    }
}
