package com.example.demo.repository;

import com.example.demo.entity.CustomerEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReporitory extends MongoRepository<CustomerEntity,String> {
}
