package com.system27.ManyToMany.Controller;

import com.system27.ManyToMany.Model.Student;
import com.system27.ManyToMany.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> studentList(){
        return studentService.findAllStudent();
    }

    @PostMapping
    @RequestMapping("/{id}/add")
    public Student addClass(@PathVariable("id") String id, @RequestParam(value = "classId") String classId){
        return studentService.addClassById(id, classId);
    }

    @DeleteMapping
    @RequestMapping("/{id}/remove")
    public Student removeClass(@PathVariable("id") String id, @RequestParam(value = "classId") String classId){
        return studentService.removeClassById(id, classId);
    }
}
