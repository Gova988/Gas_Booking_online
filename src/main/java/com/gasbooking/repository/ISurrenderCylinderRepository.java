package com.gasbooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasbooking.entity.SurrenderCylinder;

public interface ISurrenderCylinderRepository extends JpaRepository<SurrenderCylinder, Integer>{

	Optional<SurrenderCylinder> findById(int surrenderCylinderId);



}
