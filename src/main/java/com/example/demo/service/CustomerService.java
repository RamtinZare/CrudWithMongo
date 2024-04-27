package com.example.demo.service;

import com.example.demo.entity.CustomerEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService  {
    CustomerEntity create (CustomerEntity customerEntity);
    CustomerEntity serachById (String id);
    List<CustomerEntity> searchAll ();
    CustomerEntity update (CustomerEntity customerEntity,String id);
    void delete (String id);
}
