package com.ecommerce.sunburn.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.sunburn.constants.SunburnAddressConstants;
import com.ecommerce.sunburn.model.AddressDTO;
import com.ecommerce.sunburn.service.SunburnAddressServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sunburn")
public class SunburnAddressController {

	@Autowired
	private SunburnAddressServiceImpl sunburnAddressServiceImpl;

	@PostMapping("/createAddress")	
	public ResponseEntity<Map<String, Object>> createAddress(@Valid @RequestBody AddressDTO addressDTO) {
		AddressDTO saveAddress = sunburnAddressServiceImpl.createAddress(addressDTO);
		if (saveAddress != null) {
			Map<String, Object> response = new HashMap<>();
			response.put("status", 201);
			response.put("message", SunburnAddressConstants.Message_201);
			response.put("address", saveAddress);
			return ResponseEntity.status(HttpStatus.CREATED).body(response);
		} else {
			Map<String, Object> errorResponse = new HashMap<>();
			errorResponse.put("status", 400);
			errorResponse.put("message", "Failed to create the address. Please check the details and try again.");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
		}
	}

	
	  @GetMapping("/address") 
	  public ResponseEntity<List<AddressDTO>> getAllAddress() {
		  List<AddressDTO> addressDTO = sunburnAddressServiceImpl.getAllAddress();
	  return ResponseEntity.status(HttpStatus.CREATED).body(addressDTO); 
	  }
	 
	  @GetMapping("/address/{id}")
	  public ResponseEntity<AddressDTO> getAddressById(@PathVariable Long id) {
		 AddressDTO add = sunburnAddressServiceImpl.getAddressById(id);
		return ResponseEntity.status(HttpStatus.CREATED).body(add);
		  
	  }
	  
	  @PutMapping()
	  public ResponseEntity<AddressDTO> updateAddress(@RequestBody AddressDTO addressDTO) {
		  
		 return null;
	  }
	  
	  @DeleteMapping("address/{id}")
	  public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
		  sunburnAddressServiceImpl.deleteAddress(id);
		  return ResponseEntity.status(HttpStatus.ACCEPTED).body(null);
	  }
	  
}
