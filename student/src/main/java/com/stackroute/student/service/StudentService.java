package com.stackroute.student.service;
import com.stackroute.student.exception.StudentAlreadyExistsException;
import com.stackroute.student.exception.StudentNotExistsException;
import com.stackroute.student.model.Student;
import com.stackroute.student.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.stackroute.student.repository.StudentRepo;





@Service
public class StudentService {
    //auto wire the StudentRepository
    @Autowired
    private StudentRepo studentRepo;

    //create a method to saveStudent()

    public Student saveStudent(Student student) throws StudentAlreadyExistsException {
        if(studentRepo.existsById(student.getStudentId())==null){
            throw new StudentAlreadyExistsException("Student already exists");
        }
        Student savedStudent = studentRepo.save(student);
        if(savedStudent == null){
            throw new StudentAlreadyExistsException("Student already exists");
        }
        return savedStudent;
    }

    //create a method to getAllStudents()

    public List<Student> getAllStudents() throws StudentNotExistsException {
        List<Student> studentList = studentRepo.findAll();
        if(studentList.size() == 0){
            throw new StudentNotExistsException("Student not exists");
        }
        return studentList;
    }

    // getStudentById()

    public Student getStudentById(String studentId) throws StudentNotExistsException {
        if(studentRepo.existsById(studentId)!=null){
            throw new StudentNotExistsException("Student not exists");
        }
        return studentRepo.findById(studentId);
    }



}
