package com.ecommerce.sunburn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.sunburn.exception.AddressException;
import com.ecommerce.sunburn.model.AddressDTO;
import com.ecommerce.sunburn.repository.SunburnAddressRepository;
import org.modelmapper.ModelMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SunburnAddressServiceImpl implements SunburnAddressService {
	
	@Autowired
	private SunburnAddressRepository sunburnAddressRepository;
	
	private ModelMapper mapper;
	
	@Override
	public AddressDTO createAddress(AddressDTO addressDTO) {
		return sunburnAddressRepository.save(addressDTO);
		
	}
	@Override
	public List<AddressDTO> getAllAddress() {
		List<AddressDTO> addressDTO = sunburnAddressRepository.findAll();
		return addressDTO;
	}
	
	@Override
	public AddressDTO getAddressById(Long id) {
		AddressDTO addressDTO = sunburnAddressRepository.findById(id).orElseThrow(() -> new AddressException("Address Not Found"));
		return addressDTO;
	}
	
	@Override
	public void deleteAddress(@PathVariable Long id) {
		// TODO Auto-generated method stub
		sunburnAddressRepository.deleteById(id);
	
	}
	@Override
	public AddressDTO updateAddress(AddressDTO addressDTO) {
		// TODO Auto-generated method stub
		AddressDTO updateAddress = new AddressDTO();
		updateAddress.setName(addressDTO.getName());
		return null;
	}
	

}
