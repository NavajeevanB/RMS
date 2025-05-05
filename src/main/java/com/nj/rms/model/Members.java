package com.nj.rms.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Members {

	private String customer_id;
	
	private LocalDateTime join_date;
	
	public Members() {
	}

}
