package com.barato.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.barato.model.entities.Times;

@Repository
public interface ITimeRepository extends JpaRepository<Times, Long>{

	List<Times> findByPais(String pais);
}
