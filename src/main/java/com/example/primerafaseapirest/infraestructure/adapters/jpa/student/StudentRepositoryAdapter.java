package com.example.primerafaseapirest.infraestructure.adapters.jpa.student;

import com.example.primerafaseapirest.domain.model.gateway.IStudentRepository;
import com.example.primerafaseapirest.domain.model.student.Student;
import com.example.primerafaseapirest.infraestructure.adapters.jpa.student.entity.StudentDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor //Me crea el constructor con todos los argumentos
public class StudentRepositoryAdapter implements IStudentRepository {

    public final IStudentAdapterRepository repository;


    @Override
    public Student saveStudent(Student student) {
        StudentDBO studentDBO = new StudentDBO().fromDomain(student);
        return studentDBO.toDomain(repository.save(studentDBO));
    }

}
