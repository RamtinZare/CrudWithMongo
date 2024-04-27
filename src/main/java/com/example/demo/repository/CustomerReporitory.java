package com.example.demo.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerReporitory extends MongoRepository<CustomerReporitory,String> {
}
