package com.example.primerafaseapirest.infraestructure.entrypoint.course;

import com.example.primerafaseapirest.domain.model.course.dto.CourseDTO;
import com.example.primerafaseapirest.domain.usacase.course.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@AllArgsConstructor
public class CourseEntryPoint {
    private final CourseRepository courseRepository;

    @PostMapping
    public ResponseEntity<?> saveCourse(CourseDTO courseDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(courseRepository.saveCourse(courseDTO));
    }

}
