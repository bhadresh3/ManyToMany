package com.system27.ManyToMany.Repo;

import com.system27.ManyToMany.Model.Clazz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepo extends JpaRepository<Clazz, Integer> {
}
