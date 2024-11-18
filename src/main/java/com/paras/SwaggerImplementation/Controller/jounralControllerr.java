package com.paras.SwaggerImplementation.Controller;

import com.paras.SwaggerImplementation.Entity.Students1;
import com.paras.SwaggerImplementation.Service.StudentService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@Tag(name="Jounral api",description = " create ,read update ,delete students")
@RequestMapping("/jounral")
public class jounralControllerr {



//    @Autowired
//    private StudentService service;
//    @Hidden
//    @RequestMapping("/")
//    public void redirect(HttpServletResponse response ) throws IOException {
//        response.sendRedirect("/swagger-ui/index.html");
//
//    }


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
