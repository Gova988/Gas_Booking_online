package com.gasbooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gasbooking.entity.Customer;
import com.gasbooking.entity.GasBooking;
@Repository
public interface IGasBookingRepository extends JpaRepository<GasBooking, Integer> {
	
	@Query("from Customer c inner join fetch c.gasBooking where c.id = :customerId")
	public Customer findBycustomerId(@Param("customerId") int customerId);

	public Optional<GasBooking> findById(GasBooking gasBooking); 
	
}
