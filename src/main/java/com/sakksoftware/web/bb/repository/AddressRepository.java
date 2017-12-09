package com.sakksoftware.web.bb.repository;

import com.sakksoftware.web.bb.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
}
