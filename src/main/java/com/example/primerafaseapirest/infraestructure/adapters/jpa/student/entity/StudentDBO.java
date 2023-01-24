package com.example.primerafaseapirest.infraestructure.adapters.jpa.student.entity;

import com.example.primerafaseapirest.domain.model.student.Student;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentEmail;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentId;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentName;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentPhone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDBO {
    @Id
    private Long id;
    private String name;
    private String phone;
    private String email;

    public Student toDomain(StudentDBO studenDBO){
        return new Student(
                new StudentId(studenDBO.getId()),
                new StudentName(studenDBO.getName()),
                new StudentPhone(studenDBO.getPhone()),
                new StudentEmail(studenDBO.getEmail())
        );
    }
    //Debo retornar un DBO y lo capturo de un object Value
    public StudentDBO fromDomain(Student student){
        return new StudentDBO(
                student.getId().getValue(),
                student.getName().getValue(),
                student.getPhone().getValue(),
                student.getEmail().getValue()
        );
    }

}
