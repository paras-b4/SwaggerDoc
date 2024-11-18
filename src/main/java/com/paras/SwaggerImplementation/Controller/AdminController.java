package com.paras.SwaggerImplementation.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
@RestController
@Tag(name="Admin apis")
@RequestMapping("/Admin")
public class AdminController {



    @GetMapping("/students")
    @CrossOrigin
    public String getAllStudents(){
        return "hey paras";

    }
    @GetMapping("/student/{id}")
    @CrossOrigin
    public String getStudentBYID()
    {
        return "hello";
    }
    @PostMapping("/student")
    @CrossOrigin
    public void addStudent()
    {
        System.out.println("how are you");
    }
    @PutMapping("/student/update")
    @CrossOrigin
    public String updateStudent()
    {
        return "students is updated";
    }
    @DeleteMapping("/student/{id}")
    public String  deleteStudent(){
        return "student is deleted";
    }
}
