package com.gasbooking.service;

import java.util.List;
import java.util.Optional;

import com.gasbooking.entity.Cylinder;
import com.gasbooking.exception.CylinderNotFoundException;

public interface IServiceCylinder {
	public Cylinder insertCylinder(Cylinder cylinder);
    public Cylinder updateCylinder(Cylinder cylinder ) throws com.gasbooking.exception.CylinderNotFoundException;
    public Cylinder deleteCylinder(int cylinderId) throws CylinderNotFoundException ;
    public List<Cylinder> viewCylinderByType(String type) throws CylinderNotFoundException;
	public void deleteById(int id);
	public Optional<Cylinder> getCylinder(String type);
	public List<Cylinder> viewCylinder();
	public Cylinder getCylinder(int id);
} 