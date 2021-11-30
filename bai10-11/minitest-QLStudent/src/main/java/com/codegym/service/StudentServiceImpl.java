package com.codegym.service;

import com.codegym.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    List<Student> students;

    public StudentServiceImpl() {
        students = new ArrayList<>();
        students.add(new Student(1,"Nguyen Van A", 6.5,7.0,6.0));
        students.add(new Student(2,"Nguyen Van B", 5.8,4.5,5.0));
        students.add(new Student(3,"Nguyen Van C", 6.2,5.2,7.4));
        students.add(new Student(4,"Nguyen Van D", 7.5,6.3,6.5));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public int findIndexOfById(int id) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                index = id;
            }
        }
        return index;
    }

    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if (student.getId() == id)
                return student;
        }
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }

    @Override
    public void update(int id, Student student) {
        students.remove(findIndexOfById(id));
        students.set(id,student);
    }

    @Override
    public void delete(int id) {
    students.remove(id);
    }
}
