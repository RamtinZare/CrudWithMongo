package com.example.demo.controller;

import com.example.demo.adapter.CustomerAdapter;
import com.example.demo.dto.InputDto;
import com.example.demo.dto.OutputDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customerApi")
public class CostomerController {
    private final CustomerAdapter customerAdapter;

    public CostomerController(CustomerAdapter customerAdapter) {
        this.customerAdapter = customerAdapter;
    }
    @PostMapping("/create")
    public ResponseEntity<OutputDto> create(@RequestBody InputDto inputDto) {
        OutputDto outputDto = customerAdapter.create(inputDto);
        return new ResponseEntity<>(outputDto, HttpStatus.CREATED);
    }
    @GetMapping("/searchAll")
    public ResponseEntity<List<OutputDto>> searchAll() {
        List<OutputDto> outputDtos = customerAdapter.searchAll();
        return new ResponseEntity<>(outputDtos,HttpStatus.OK);
    }
    @GetMapping("/searchById/{id}")
    public ResponseEntity<OutputDto> searchById(@PathVariable("id") String id)
    {
        OutputDto outputDto = customerAdapter.searchById(id);
        return new ResponseEntity<>(outputDto,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<OutputDto> update(@RequestBody InputDto inputDto,@PathVariable("id") String id) {
        OutputDto outputDto = customerAdapter.update(inputDto,id);
        return new ResponseEntity<>(outputDto,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<OutputDto> delete (@PathVariable("id") String id)
    {
        customerAdapter.delete(id);
        return null;
    }
}