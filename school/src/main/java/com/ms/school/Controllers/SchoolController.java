package com.ms.school.Controllers;
import com.ms.school.Entites.FullSchoolResponse;
import com.ms.school.Entites.School;
import com.ms.school.Services.SchoolService;
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
@RequestMapping("/api/v1/school")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void saveStudent(@RequestBody School school) {
        schoolService.SaveSchool(school);
    }
    @GetMapping
    public ResponseEntity<List<School>> findAll() {
    return  ResponseEntity.ok(schoolService.findAll());
    }
 @GetMapping("/withstudent/{school-id}")
    public ResponseEntity<FullSchoolResponse> findAllwithStudent(@PathVariable("school-id") UUID schoolId) {
    return  ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }
}
