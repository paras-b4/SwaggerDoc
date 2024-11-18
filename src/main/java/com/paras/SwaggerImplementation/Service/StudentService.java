package com.paras.SwaggerImplementation.Service;

import com.paras.SwaggerImplementation.Entity.Students1;
import com.paras.SwaggerImplementation.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Students1> getAllStudents() {
        return repo.findAll();
    }

    public Optional<Students1> getStudentBYID(int id) {
        return repo.findById(id);
    }

    public Students1 addStudent(Students1 students1) {
        return repo.save(students1);
    }

    public Students1 updateStudent(int id,Students1 students1) {

        Students1 students2=repo.findById(id).orElse(null);
        if(id!=students1.getId()){
            throw new IllegalArgumentException("ID in the path and in the request body do not match.");
        };
        return repo.save(students1);


    }

    public Students1 deleteStudent(int id) {
        Optional<Students1> student =getStudentBYID(id);
        repo.deleteById(id);
        return student.get();

    }
}
