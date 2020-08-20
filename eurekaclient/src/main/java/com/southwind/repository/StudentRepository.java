package com.southwind.repository;

import com.southwind.entity.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById( long id);
    public void saveOrUpdate(Student student);
    public void deleteById( long id);
}
