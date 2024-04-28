package com.example.demo.service.impl;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.exeption.Exeption;
import com.example.demo.repository.CustomerReporitory;
import com.example.demo.service.CustomerService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerImpl implements CustomerService {
    private final CustomerReporitory customerReporitory;

    public CustomerImpl(CustomerReporitory customerReporitory) {
        this.customerReporitory = customerReporitory;
    }

    @Override
    public CustomerEntity create(CustomerEntity customer) {
        CustomerEntity customerEntity=customerReporitory.save(customer);
        return customerEntity;
    }

    @Override
    public CustomerEntity serachById(String id) {
        CustomerEntity customerEntity = customerReporitory.findById(id).orElseThrow(()-> new Exeption("not found thid"+id));
        return customerEntity;
    }

    @Override
    public List<CustomerEntity> searchAll() {
        List<CustomerEntity> customerEntities=customerReporitory.findAll();
        return customerEntities;
    }

    @Override
    public CustomerEntity update(CustomerEntity customerEntity, String id) {
        CustomerEntity customer =customerReporitory.findById(id).orElseThrow(()-> new Exeption("not found this id"+id));
        customer.setCustomerId(customerEntity.getCustomerId());
        customer.setCustomerEmail(customerEntity.getCustomerEmail());
        customer.setAge(customerEntity.getAge());
        customer.setCustomerName(customerEntity.getCustomerName());
        customer.setCustomerMeli(customerEntity.getCustomerMeli());
        customer.setCustomerPhone(customerEntity.getCustomerPhone());

        return customer;
    }

    @Override
    public void delete(String id) {
        customerReporitory.deleteById(id);
    }

    @Override
    public List<CustomerEntity> sorted(String age) {
        return customerReporitory.findAll(Sort.by(age));
    }

}
