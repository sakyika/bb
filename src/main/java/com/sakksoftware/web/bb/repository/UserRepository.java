package com.sakksoftware.web.bb.repository;

import com.sakksoftware.web.bb.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {

    //@PostAuthorize("returnObject.email == principal.username or hasRole('ROLE_ADMIN')")
    User findByEmail(String email);

    //@PreAuthorize("hasRole('ROLE_ADMIN')")
    Page<User> findAll(Pageable pageable);



}
