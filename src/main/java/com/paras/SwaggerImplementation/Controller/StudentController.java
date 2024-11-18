package com.paras.SwaggerImplementation.Controller;

import com.paras.SwaggerImplementation.Entity.Students1;
import com.paras.SwaggerImplementation.Service.StudentService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@Tag(name="Paras's controller",description = "Paras can create ,read update ,delete students")
//@SecurityRequirement(name = "auth")

public class StudentController {



    @Autowired
    private StudentService service;
    @Hidden
    @RequestMapping("/")
    public void redirect(HttpServletResponse response ) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");

    }
    @GetMapping("/students")
    @Operation(summary = "get all students")
    @CrossOrigin
    public List<Students1> getAllStudents(){
        return service.getAllStudents();

    }
    @GetMapping("/student/{id}")
    @Operation(summary = "get one student by id ")
    @CrossOrigin
    public Optional<Students1> getStudentBYID(@PathVariable int id)
    {
        return service.getStudentBYID(id);
    }
    @PostMapping("/student")
    @Operation(summary= "it will add student")
    @CrossOrigin
    public Students1 addStudent(@RequestBody Students1 students1)
    {
        return service.addStudent(students1);
    }
    @PutMapping("/student/{id}")
    @Operation(summary = "update you student details")
    @CrossOrigin

    public Students1 updateStudent(@PathVariable int id ,@RequestBody Students1 students1)
    {
        return service.updateStudent(id,students1);
    }
    @DeleteMapping("/student/{id}")
    @Operation(summary = "delete student if you want")
    public Students1 deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
