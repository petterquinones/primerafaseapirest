package com.example.primerafaseapirest.domain.usacase.student;

import com.example.primerafaseapirest.domain.model.gateway.IStudentRepository;
import com.example.primerafaseapirest.domain.model.student.dto.StudentDTO;

public class StudentRepository {
    private final IStudentRepository repository;

    public StudentRepository(IStudentRepository repository) {
        this.repository = repository;
    }
    //Estudian esto bien
    public StudentDTO save(StudentDTO studentDTO){
        return studentDTO.fromDomain(
                repository.saveStudent(
                        studentDTO.toDomain(
                                studentDTO)));
    }
}
