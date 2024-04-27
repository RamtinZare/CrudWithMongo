package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OutputDto {

    private String customerId;
    private String customerName;
    private String customerEmail;
    private String customerMeli;
    private String customerPhone;
}
