package com.system27.ManyToMany.Controller;

import com.system27.ManyToMany.Model.Clazz;
import com.system27.ManyToMany.Model.Student;
import com.system27.ManyToMany.Repo.ClassRepo;
import com.system27.ManyToMany.Service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/class")
@RequiredArgsConstructor
public class ClassController {

    private final ClassService classService;

    @GetMapping
    public List<Clazz> getAllClass(){
        return classService.findAllClazz();
    }

}
