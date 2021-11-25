package com.gasbooking.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gasbooking.entity.Admin;
import com.gasbooking.exception.AdminNotFoundException;
import com.gasbooking.repository.IAdminRepository;
import com.gasbooking.repository.IGasBookingRepository;

public class AdminServiceImpl implements IAdminService{
		@Autowired
		IAdminRepository adminDao;

		@Autowired
		IGasBookingRepository gasBookingDao;
		
		Logger logger=LoggerFactory.getLogger(AdminServiceImpl.class);

		@Override
		public Admin insertAdmin(Admin admin) {
			// TODO Auto-generated method stub
			logger.info("***********Inserting Admin Details*********************");
			
			return adminDao.save(admin);
		}

		@Override
		public Admin updateAdmin(int adminId, Admin admin) throws AdminNotFoundException{
			logger.info("***********Updating Admin Details*********************");
			
			Optional<Admin> daoAdmin = adminDao.findById(adminId);
			
			if (daoAdmin.isPresent()) {
				Admin adminSave=daoAdmin.get();
				adminSave.setUsername(admin.getUsername());
				adminSave.setPassword(admin.getPassword());
				adminSave.setAddress(admin.getAddress());
				adminSave.setMobileNumber(admin.getMobileNumber());
				adminSave.setEmail(admin.getEmail());
				return adminDao.save(adminSave);
			}
			else {
				throw new AdminNotFoundException("Admin Not Found");
			}
		}

		@Override
		public Admin deleteAdmin(int adminId) throws AdminNotFoundException{
			logger.info("***********Deleting Admin Details*********************");
			
			Optional<Admin> optional=adminDao.findById(adminId);
			if(optional.isPresent()) {
				Admin gotAdmin=optional.get();
				adminDao.delete(gotAdmin);
				return gotAdmin;
				
			}
			else {
				throw new AdminNotFoundException("Please Give proper id to delete");
			}
		}
		
		
		
}
