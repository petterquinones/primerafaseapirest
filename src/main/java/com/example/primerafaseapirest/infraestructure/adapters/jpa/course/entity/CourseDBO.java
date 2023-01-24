package com.example.primerafaseapirest.infraestructure.adapters.jpa.course.entity;

import com.example.primerafaseapirest.domain.model.course.Course;
import com.example.primerafaseapirest.domain.model.course.attributes.CourseId;
import com.example.primerafaseapirest.domain.model.course.attributes.CourseName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "course")
public class CourseDBO {
    @Id
    private Long id;
    private String name;

    public Course toDomain(CourseDBO courseDBO){
        return  new Course(
                        new CourseId(courseDBO.getId()),
                        new CourseName(courseDBO.getName())
        );
    }

    public CourseDBO fromDomain(Course course){
        return new CourseDBO(
                course.getId().getValue(),
                course.getName().getValue()
        );
    }
}
