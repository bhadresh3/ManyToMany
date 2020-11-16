package com.system27.ManyToMany.Service;

import com.system27.ManyToMany.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();

    Student addClassById(String id, String classId);

    Student removeClassById(String id, String classId);
}
