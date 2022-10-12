package com.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Sales {

	private String customer_id;
	
	private LocalDateTime order_date;
	
	private String product_id;
	
	public Sales() {
	}

}
