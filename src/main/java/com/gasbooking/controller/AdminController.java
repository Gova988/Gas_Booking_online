package com.gasbooking.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gasbooking.entity.Admin;
import com.gasbooking.exception.AdminNotFoundException;
import com.gasbooking.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	IAdminService adminService;
	

	@PostMapping("/insert")
	public ResponseEntity<Admin> insertAdmin(@Valid @RequestBody Admin admin) {
		Admin serviceAdmin = adminService.insertAdmin(admin);
		return new ResponseEntity<>(serviceAdmin, HttpStatus.CREATED);
	}

	@PutMapping("/update/{adminId}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable int adminId,@Valid @RequestBody Admin admin) throws AdminNotFoundException, Exception {
		
		Admin serviceAdmin = adminService.updateAdmin(adminId,admin);
		return new ResponseEntity<>(serviceAdmin, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{adminId}")
	public ResponseEntity<Admin> deleteAdmin(@PathVariable int adminId) throws AdminNotFoundException, Exception {
		
		Admin serviceAdmin = adminService.deleteAdmin(adminId);
		return new ResponseEntity<>(serviceAdmin, HttpStatus.OK);
	}


}
