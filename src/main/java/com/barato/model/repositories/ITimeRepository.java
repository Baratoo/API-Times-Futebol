package com.barato.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barato.model.entities.Times;

public interface ITimeRepository extends JpaRepository<Times, Long>{

}
