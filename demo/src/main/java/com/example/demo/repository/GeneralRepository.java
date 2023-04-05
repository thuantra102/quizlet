package com.example.demo.repository;

import com.example.demo.model.GeneralEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GeneralRepository<E> extends JpaRepository<E,Integer> {
}
