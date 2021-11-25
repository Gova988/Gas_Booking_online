package com.gasbooking.service;

import com.gasbooking.entity.Admin;
import com.gasbooking.exception.AdminNotFoundException;

public interface IAdminService {
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(int adminId,Admin admin) throws AdminNotFoundException;
	public Admin deleteAdmin(int adminId) throws AdminNotFoundException;
}
