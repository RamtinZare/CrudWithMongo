package com.example.demo.customerMap;

import com.example.demo.dto.InputDto;
import com.example.demo.dto.OutputDto;
import com.example.demo.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMap  {
    CustomerEntity mapToCustomerEntity (InputDto inputDto);
    OutputDto mapToCustomerOutputDto(CustomerEntity customerEntity);

}
