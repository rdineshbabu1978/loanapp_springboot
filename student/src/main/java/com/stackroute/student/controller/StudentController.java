package com.stackroute.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stackroute.student.exception.StudentAlreadyExistsException;
import com.stackroute.student.exception.StudentNotExistsException;
import com.stackroute.student.model.Student;
import com.stackroute.student.service.StudentService;


@Restcontroller
public class StudentController {

@Autowired 
public StudentService studentService;


//create postmapping to save student
@PostMapping("/student")
public ResponseEntity<?> saveStudent(@RequestBody Student student){
    try{
        Student savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }catch (StudentAlreadyExistsException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    }
}
//create postmapping to get student by id

@GetMapping("/student/{studentId}")

public ResponseEntity<?> getStudentById(@PathVariable String studentId){
    try{
        Student student = studentService.getStudentById(studentId);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }catch (StudentNotExistsException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }

}
}
