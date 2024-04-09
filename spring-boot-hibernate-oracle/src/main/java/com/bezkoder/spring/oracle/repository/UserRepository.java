package com.bezkoder.spring.oracle.repository;

import com.bezkoder.spring.oracle.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<Users, Long> {
    Users findOneByUserNamIgnoreCaseAndPassword(String username, String password);
}
