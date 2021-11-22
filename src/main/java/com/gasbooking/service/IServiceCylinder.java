package com.gasbooking.service;

import java.util.List;

import com.gasbooking.entity.Cylinder;

public interface IServiceCylinder {
	public List<Cylinder> viewCylinder();
	public Cylinder insertCylinder(Cylinder cylinder);
    public Cylinder updateCylinder(Cylinder cylinder );
    public void deleteById(int id);
    public List<Cylinder> getCylinder();
    public Cylinder getCylinder(int id);
}