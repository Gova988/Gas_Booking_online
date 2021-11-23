package com.gasbooking.service;

import java.util.List;

import com.gasbooking.entity.Cylinder;
import com.gasbooking.exception.CylinderNotFoundException;

public interface IServiceCylinder {
	public Cylinder insertCylinder(Cylinder cylinder);
    public Cylinder updateCylinder(Cylinder cylinder ) throws com.gasbooking.exception.CylinderNotFoundException;
    public Cylinder deleteCylinder(int cylinderId) throws CylinderNotFoundException ;
    public List<Cylinder> viewCylinderByType(String type) throws CylinderNotFoundException;
} 