package com.example.primerafaseapirest.domain.usacase.course;

import com.example.primerafaseapirest.domain.model.course.dto.CourseDTO;
import com.example.primerafaseapirest.domain.model.gateway.ICourseRepository;

public class CourseRepository {
    private final ICourseRepository repository;

    public CourseRepository(ICourseRepository repository) {
        this.repository = repository;
    }
    //
    public CourseDTO saveCourse(CourseDTO courseDTO){
        return  courseDTO.fromDomain(
                repository.saveCourse(
                        courseDTO.toDomain(
                                courseDTO)));
    }
}
