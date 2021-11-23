package com.gasbooking.exception;

public class CylinderNotFoundException extends Exception {


		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String errormessage;
		
		
		public String getErrormessage() {
			return errormessage;
		}
		public void setErrormessage(String errormessage) {
			this.errormessage = errormessage;
		}
		public CylinderNotFoundException( String errormessage) {
			super();
		
			this.errormessage = errormessage;
		}
		
	     public CylinderNotFoundException () {
	    	 
	     }
}
