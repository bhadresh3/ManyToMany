package com.system27.ManyToMany.Service;

import com.system27.ManyToMany.Model.Clazz;
import com.system27.ManyToMany.Model.Student;
import com.system27.ManyToMany.Repo.ClassRepo;
import com.system27.ManyToMany.Repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;
    private final ClassRepo classRepo;

    @Override
    public List<Student> findAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student addClassById(String id, String classId) {
         return studentRepo.findById(Integer.parseInt(id)).map(
                 student -> classRepo.findById(Integer.parseInt(classId)).map(clazz -> {
                     student.getClazzList().add(clazz);
                     return studentRepo.save(student);
                 }).get()).get();
    }

    @Override
    public Student removeClassById(String id, String classId) {
        return studentRepo.findById(Integer.parseInt((id))).map(
                student -> classRepo.findById(Integer.parseInt(classId)).map(clazz -> {
                    student.getClazzList().remove(clazz);
                    return studentRepo.save(student);
                }).get()).get();
    }


}
