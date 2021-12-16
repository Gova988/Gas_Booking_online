package com.gasbooking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gasbooking.entity.Cylinder;
import com.gasbooking.exception.CylinderNotFoundException;

@Service
public interface ICylinderService {
public Cylinder insertCylinder(Cylinder cylinder);
	
    public Cylinder updateCylinder(int cylinderId, Cylinder cylinder ) throws com.gasbooking.exception.CylinderNotFoundException;
    
    public Cylinder deleteCylinder(int cylinderId) throws CylinderNotFoundException ;
    
    public List<Cylinder> viewCylinderByType(String type) throws CylinderNotFoundException;
        public Cylinder viewCylinder(int cylinderId) throws CylinderNotFoundException;

	
    

} 
