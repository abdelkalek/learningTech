package com.ms.student.Controllers;

import com.ms.student.Services.StudentService;
import com.ms.student.entites.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveStudent(@RequestBody Student student) {
        studentService.SaveStudent(student);
    }
    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
    return  ResponseEntity.ok(studentService.findAll());
    }
 @GetMapping("/school/{shoolid}")
    public ResponseEntity<List<Student>> findAllBySchoolUuid(@PathVariable("shoolid") UUID shoolid) {
    return  ResponseEntity.ok(studentService.findAllStudentsBySchoolUuid(shoolid));
    }
}
