package com.example.primerafaseapirest.infraestructure.adapters.jpa.course;

import com.example.primerafaseapirest.domain.model.course.Course;
import com.example.primerafaseapirest.domain.model.gateway.ICourseRepository;
import com.example.primerafaseapirest.infraestructure.adapters.jpa.course.entity.CourseDBO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseRepositoryAdapter implements ICourseRepository {
    private final ICourseAdapterRepository repository;
    @Override
    public Course saveCourse(Course course) {
        //Tomamos el curso y lo convertimos a DBO
        CourseDBO courseDBO = new CourseDBO().fromDomain(course);
        return courseDBO.toDomain(repository.save(courseDBO));
    }
}
