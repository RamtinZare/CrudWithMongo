package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("test01")
public class CustomerEntity {
    @Id
    private String customerId;
    private String customerName;
    private String age;
    private String customerEmail;
    private String customerMeli;
    private String customerPhone;
}
