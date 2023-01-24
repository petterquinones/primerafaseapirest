package com.example.primerafaseapirest.infraestructure.entrypoint.student;

import com.example.primerafaseapirest.domain.model.student.dto.StudentDTO;
import com.example.primerafaseapirest.domain.usacase.student.StudentRepository;
import com.example.primerafaseapirest.infraestructure.adapters.jpa.student.entity.StudentDBO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentEntryPoint {
    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<?> saveStudent(StudentDTO studentDTO){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(studentRepository.save(studentDTO));
    }

}
