package com.ecommerce.sunburn.service;

import java.util.List;

import com.ecommerce.sunburn.model.AddressDTO;

public interface SunburnAddressService {
	
	AddressDTO createAddress(AddressDTO addressDTO);
	
	List<AddressDTO> getAllAddress();
	
	AddressDTO getAddressById(Long id);
	
	AddressDTO updateAddress(AddressDTO addressDTO);
	
	void deleteAddress(Long id);
}
