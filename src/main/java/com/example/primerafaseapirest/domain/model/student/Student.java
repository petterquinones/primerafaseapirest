package com.example.primerafaseapirest.domain.model.student;

import com.example.primerafaseapirest.domain.model.student.attributes.StudentEmail;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentId;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentName;
import com.example.primerafaseapirest.domain.model.student.attributes.StudentPhone;

public class Student {
    private final StudentId id;
    private final StudentName name;
    private final StudentPhone phone;
    private final StudentEmail email;

    //Builder
    public Student(StudentId id, StudentName name, StudentPhone phone, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    //Getter


    public StudentId getId() {
        return id;
    }

    public StudentName getName() {
        return name;
    }

    public StudentPhone getPhone() {
        return phone;
    }

    public StudentEmail getEmail() {
        return email;
    }
}
