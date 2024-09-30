package com.barato.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barato.model.entities.Times;

@Repository
public interface ITimeRepository extends JpaRepository<Times, Long>{

}
