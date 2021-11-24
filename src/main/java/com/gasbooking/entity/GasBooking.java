package com.gasbooking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class GasBooking {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int gasBookingId;
		private int customerId;
		//@NotBlank(message="Localdate cannot be blank")
		private LocalDate localDate=LocalDate.now();

		private boolean status;
		private float bill;
		
		//constructors
		public GasBooking() {
			super();
		}
		public GasBooking(int gasBookingId, int customerId, LocalDate localDate, boolean status, float bill) {
			super();
			this.gasBookingId = gasBookingId;
			this.customerId = customerId;
			this.localDate = localDate;
			this.status = status;
			this.bill = bill;
		}
		
		//setters and getters
		public int getGasBookingId() {
			return gasBookingId;
		}
		public void setGasBookingId(int gasBookingId) {
			this.gasBookingId = gasBookingId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public LocalDate getLocalDate() {
			return localDate;
		}
		public void setLocalDate(LocalDate localDate) {
			this.localDate = localDate;
		}
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public float getBill() {
			return bill;
		}
		public void setBill(float bill) {
			this.bill = bill;
		}
		@Override
		public String toString() {
			return "GasBooking [gasBookingId=" + gasBookingId + ", CustomerId=" + customerId + ", localDate=" + localDate
					+ ", status=" + status + ", bill=" + bill + "]";
		}
	
	

}
