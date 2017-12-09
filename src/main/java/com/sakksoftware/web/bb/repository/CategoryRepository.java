package com.sakksoftware.web.bb.repository;

import com.sakksoftware.web.bb.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
