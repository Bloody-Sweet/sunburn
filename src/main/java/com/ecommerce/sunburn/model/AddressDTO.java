package com.ecommerce.sunburn.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Document(collection = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddressDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private long phoneNumber;
	
	private String emailAddress;
	
	private LocationDTO locationDTO; 
	
}
