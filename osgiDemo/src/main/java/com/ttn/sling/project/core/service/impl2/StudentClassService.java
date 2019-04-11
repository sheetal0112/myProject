package com.ttn.sling.project.core.service.impl2;

import java.util.List;

public interface StudentClassService {

    String addStudent(Student s);
    boolean deleteStudent(int id);
    boolean isStudentPassed(int id);
    Student getStudent(int id);
    List<Student> getAllStudents();
}

