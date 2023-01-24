package com.example.primerafaseapirest.domain.model.gateway;

import com.example.primerafaseapirest.domain.model.course.Course;

public interface ICourseRepository {
    Course saveCourse(Course course);
}
