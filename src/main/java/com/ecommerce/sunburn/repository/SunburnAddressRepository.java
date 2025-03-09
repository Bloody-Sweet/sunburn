package com.ecommerce.sunburn.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.sunburn.model.AddressDTO;

@Repository
public interface SunburnAddressRepository extends MongoRepository<AddressDTO, Long> {

}
