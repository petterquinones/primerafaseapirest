package com.example.primerafaseapirest.application;

import com.example.primerafaseapirest.domain.model.gateway.ICourseRepository;
import com.example.primerafaseapirest.domain.model.gateway.IStudentRepository;
import com.example.primerafaseapirest.domain.usacase.course.CourseRepository;
import com.example.primerafaseapirest.domain.usacase.student.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {
    @Bean
    public StudentRepository studentRepository(IStudentRepository iStudentRepository){
        return new StudentRepository(iStudentRepository);
        //Relacion de dependencias dentro de spring, conectar studentrepository con el iStudentRepository
    }
    @Bean
    public CourseRepository courseRepository(ICourseRepository iCourseRepository){
        return new CourseRepository(iCourseRepository);
    }
}
