package com.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Members {

	private String customer_id;
	
	private LocalDateTime join_date;
	
	public Members() {
		// TODO Auto-generated constructor stub
	}

}
