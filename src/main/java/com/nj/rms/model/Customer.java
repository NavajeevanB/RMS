package com.nj.rms.model;

import lombok.Data;

@Data
public class Customer {
	
	private String customer_id;
	
	private String customer_name;
	
	private String gender;
	
	private String email;
	
	private String address;
	
	private long mobile_number;


	public Customer() {
	}

}
