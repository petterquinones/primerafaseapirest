package com.example.primerafaseapirest.domain.model.gateway;

import com.example.primerafaseapirest.domain.model.student.Student;

public interface IStudentRepository {
    Student saveStudent(Student student);
}
