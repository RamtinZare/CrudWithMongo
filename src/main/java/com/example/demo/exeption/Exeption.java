package com.example.demo.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Exeption extends RuntimeException {
        public Exeption(String massage)
        {
            super(massage);
        }

}
