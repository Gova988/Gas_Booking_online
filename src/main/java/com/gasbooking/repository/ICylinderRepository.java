package com.gasbooking.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gasbooking.entity.Cylinder;

public interface ICylinderRepository extends JpaRepository<Cylinder, Integer> {

	
	public Cylinder insertCylinder(Cylinder cylinder);
    public Cylinder updateCylinder(Cylinder cylinder );
    public Cylinder deleteCylinder(int cylinderId);
    public List<Cylinder> viewCylinderByType(String type);
	public Optional<Cylinder> findAll(String type);


   
}
