package com.sakksoftware.web.bb.repository;

import com.sakksoftware.web.bb.model.Business;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BusinessRepository extends ReactiveMongoRepository<Business, String> {
}
