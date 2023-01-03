package com.example.springbootrestapi.controller;

import com.example.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //SpringBoot Rest APi that returns JAVA Bean to the client
    @GetMapping("/student-details")
    public Student getStudent(){
        Student student = new Student(2,"Onuchukwu Victor", "FUTO");
        return student;
    }

    //Spring Boot API That returns LIST in Json Format
    @GetMapping("/student-list")
    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Victor Krum", "FUTA"));
        students.add(new Student(3, "Chris Hemsworth", "UCLA" ));
        students.add(new Student(5, "Ekene Elvis", "Unilag"));
        return students;
    }

    //Spring Boot Rest API with Path Variable
    @GetMapping("students/{id}/{student-name}/{student-school}")
    public Student studentPathVariable(@PathVariable("id") int studentId, @PathVariable("student-name") String studentName, @PathVariable("student-school") String studentSchool){
        return new Student(studentId, studentName, studentSchool);
    }


    //SpringBoot REST API with Request Param
    // http://localhost:8080/students/query?id=1&studentName=VictorOnu&studentSchool=Unilag
    @GetMapping("/students/query")
    public Student studentRequestVariable(@RequestParam("id") int stuId, @RequestParam String studentName, @RequestParam String studentSchool){
        return new Student(stuId, studentName, studentSchool);
    }

    //SpringBoot Rest API that handles HTTP Post Request
    //@PostMapping and @RequestBody http://localhost:8080/students/create
    @PostMapping("student/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        System.out.println(student.getStuId());
        System.out.println(student.getStuName());
        System.out.println(student.getStuSchool());
        return student;
    }

    //SpringBoot REST API that handles HTTP Put Request -This means Updating existing resource or information.
}
