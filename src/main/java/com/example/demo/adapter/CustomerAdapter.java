package com.example.demo.adapter;

import com.example.demo.customerMap.CustomerMap;
import com.example.demo.dto.InputDto;
import com.example.demo.dto.OutputDto;
import com.example.demo.entity.CustomerEntity;
import com.example.demo.service.CustomerService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomerAdapter {
    private final CustomerService customerService;
    private final CustomerMap customerMap;

    public CustomerAdapter(CustomerService customerService, CustomerMap customerMap) {
        this.customerService = customerService;
        this.customerMap = customerMap;
    }
    public OutputDto create (InputDto inputDto)
    {

        CustomerEntity customerEntity = customerMap.mapToCustomerEntity(inputDto);
        CustomerEntity customer=customerService.create(customerEntity);
        return customerMap.mapToCustomerOutputDto(customer);
    }
    public List<OutputDto> searchAll ()
    {
        List<CustomerEntity> customerEntities=customerService.searchAll();
        List<OutputDto> outputDtos=customerEntities.stream().map(customerMap::mapToCustomerOutputDto).collect(Collectors.toList());
        return outputDtos;
    }
    public OutputDto searchById(String id)
    {
        CustomerEntity customerEntity=customerService.serachById(id);
        return customerMap.mapToCustomerOutputDto(customerEntity);
    }
    public OutputDto update(InputDto inputDto,String id)
    {
        CustomerEntity customerEntity = customerMap.mapToCustomerEntity(inputDto);
        CustomerEntity customer=customerService.update(customerEntity,id);
        return customerMap.mapToCustomerOutputDto(customer);
    }
    public void delete(String id)
    {
        customerService.delete(id);
    }
    public List<OutputDto> sort(String age)
    {
        List<CustomerEntity> customerEntities =customerService.sorted(age);
        List<OutputDto> outputDtos=customerEntities.stream().map(customerMap::mapToCustomerOutputDto).collect(Collectors.toList());
        return outputDtos;
    }
}
