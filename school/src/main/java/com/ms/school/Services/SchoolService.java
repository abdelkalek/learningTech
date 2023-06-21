package com.ms.school.Services;
import com.ms.school.Entites.FullSchoolResponse;
import com.ms.school.Entites.School;
import com.ms.school.Repository.ISchoolRepository;
import com.ms.school.Services.Client.IstudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
@Service
public class SchoolService {

    private final ISchoolRepository schoolRepository;
    private  IstudentClient sudentClient;

    public SchoolService(ISchoolRepository schoolRepository, IstudentClient sudentClient) {
        this.schoolRepository = schoolRepository;
        this.sudentClient = sudentClient;
    }

    public void SaveSchool(School school) {
        schoolRepository.save(school);
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(UUID schoolId ) {
        var school = schoolRepository.findById(schoolId).orElse(School.builder().name("Not-found").email("Not-found").build());
     var students = sudentClient.findAllBySchoolUuid(schoolId);
        return FullSchoolResponse.builder().name(school.getName()).email(school.getEmail()).studentList(students).build();
    }


}
