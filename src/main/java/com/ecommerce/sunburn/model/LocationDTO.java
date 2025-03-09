package com.ecommerce.sunburn.model;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocationDTO {
	
	public String streetAddress;
	
	public String apartment;
	
	public String City;
	
	public String State;
	
	@Pattern(regexp = "[A-Za-z0-9 \\\\-]", message = "Invalid Postal Code")
	public String zipcode;
}
