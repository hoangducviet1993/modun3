package com.codegym.service;

import com.codegym.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    void save(Student student);

    int findIndexOfById(int id);

    Student findById(int id);

    List<Student> findByName(String name);

    void update(int id, Student student);

    void delete(int id);

}
