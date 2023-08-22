package com.stackroute.student.model;



import jakarta.persistence.Id;




@Entity
//@Table(name="student")

public class Student {

    //add the following attributes i.e studentId, studentName, studentAge,  studentGender, studentAddress, studentContactNumber
    @Id
    public String studentId;
    public String studentName;
    public int studentAge;
    public String studentGender;
    public String studentAddress;   
    public String studentContactNumber;
    

    //add empty constructor
    public Student() {
    }

    //add parameterized constructor for all the attributes
    public Student(String studentId, String studentName, int studentAge, String studentGender, String studentAddress, String studentContactNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentContactNumber = studentContactNumber;
    }

//add getters and setters for all the attributes

    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge= studentAge;
    }

    public String getstudentGender() {
        return studentGender;
    }
    public void setstudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getstudentAddress() {
        return studentAddress;
    }

    public void setstudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getstudentContactNumber() {
        return studentContactNumber;
    }

    public void setstudentContactNumber(String studentContactNumber) {
        this.studentContactNumber = studentContactNumber;
    }

    //add toString() method
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", studentGender='" + studentGender + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentContactNumber='" + studentContactNumber + '\'' +
                '}';
    }









}
