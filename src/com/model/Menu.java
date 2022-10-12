package com.model;

import lombok.Data;

@Data
public class Menu {

	private String product_id;
	
	private String product_name;
	
	private double price;

	public Menu() {
	}

}
