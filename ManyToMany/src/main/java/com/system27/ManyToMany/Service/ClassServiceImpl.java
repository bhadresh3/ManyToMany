package com.system27.ManyToMany.Service;

import com.system27.ManyToMany.Model.Clazz;
import com.system27.ManyToMany.Repo.ClassRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ClassServiceImpl implements ClassService {

    private final ClassRepo classRepo;
    @Override
    public List<Clazz> findAllClazz() {
        return classRepo.findAll();
    }


}
