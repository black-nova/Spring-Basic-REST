package com.basic.basic_rest.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.basic.basic_rest.model.student_data;
import com.basic.basic_rest.services.RestServices;




@RestController
@RequestMapping("/")
public class Restcontroller {

    @Autowired RestServices service;

    @GetMapping("/student")
    public Optional<student_data> getMethodName(@RequestParam int id) {
  
        return service.get(id);
    }

    @PostMapping("/student")
    public String postMethodName(@RequestBody student_data data) {
        
        return service.insert(data);
    }
    

    @PutMapping("student/{id}")
    public String putMethodName(@RequestBody student_data data) {
        
         return service.update(data);
    }

    @DeleteMapping("student/{id}")
    public String deleteMethodName(@PathVariable int id) {
        
        return service.delete(id);
    }
    
    
}
