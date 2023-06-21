package com.ms.student.Services;

import com.ms.student.Repository.IStudentRepository;
import com.ms.student.entites.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
@Service
@RequiredArgsConstructor
public class StudentService {

    private final IStudentRepository studentRepository;

    public void SaveStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findAllStudentsBySchoolUuid(UUID shoolid) {
        return studentRepository.findAllBySchoolId(shoolid) ;   }


}
