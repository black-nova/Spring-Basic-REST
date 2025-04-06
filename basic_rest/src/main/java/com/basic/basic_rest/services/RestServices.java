package com.basic.basic_rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.basic_rest.dao.Repo;
import com.basic.basic_rest.model.student_data;

@Service
public class RestServices {

    @Autowired Repo repo;
    
    public Optional<student_data> get(int id)
    {      
        return repo.findById(id);
    }


    public String delete(int id)
    {      
        repo.deleteById(id);

        return "Entry Deleted";
    }

    public String update(student_data data)
    {      
        repo.save(data);

        return "Student Updated";
    }

    public String insert(student_data data)
    {   repo.save(data);
        return "Student Inserted";
    }
}
