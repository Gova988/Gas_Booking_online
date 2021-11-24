package com.gasbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gasbooking.entity.Cylinder;
import com.gasbooking.exception.CylinderNotFoundException;
import com.gasbooking.repository.ICylinderRepository;

@Service
public   class CylinderServiceImplement implements IServiceCylinder{
	@Autowired
	ICylinderRepository cylinderrepository;

	@Override
	public Cylinder insertCylinder(Cylinder cylinder) {
		
	return cylinderrepository.save(cylinder);
	}

	@Override
	public Cylinder updateCylinder(Cylinder cylinder) throws CylinderNotFoundException  {
		
        int CylinderId=cylinder.getcylinderId();
		
		Optional<Cylinder> optional = cylinderrepository.findById(CylinderId);
		if(optional.isPresent()) {
			Cylinder c1=optional.get();
			c1.setType(cylinder.getType());
			c1.setWeight(cylinder.getWeight());
			c1.setStrapColor(cylinder.getStrapColor());
			c1.setPrice(cylinder.getPrice());
			return cylinder;
		}
		else {
			throw new CylinderNotFoundException("Cylinder details not found");
		}
	}

	@Override
	public Cylinder deleteCylinder(int cylinderId) throws CylinderNotFoundException {
		Optional<Cylinder> optional=cylinderrepository.findById(cylinderId);
		if(optional.isPresent()) {
			Cylinder deletedCylinder=optional.get();
			cylinderrepository.deleteById(cylinderId);
			return deletedCylinder;
		}
		else {
			throw new CylinderNotFoundException(" Cylinder details not found");
		}
	}

	@Override
	public List<Cylinder> viewCylinderByType(String type) throws CylinderNotFoundException {
		Optional<Cylinder> optional=cylinderrepository.findAll(type);
		if(optional.isPresent()) {
			return viewCylinderByType(null);
	}
       else {
	     throw new CylinderNotFoundException("Cylinder detalis not found");
      }
	}

	@Override
	public void deleteById(int id) {
		
		
	}

	@Override
	public Optional<Cylinder> getCylinder(String type) {

		return null;
	}

	@Override
	public List<Cylinder> viewCylinder() {
	
		return null;
	}

	@Override
	public Cylinder getCylinder(int id) {
	
		return null;
	}

}
	


