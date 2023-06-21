package com.ms.student.Repository;

import com.ms.student.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
public interface IStudentRepository extends JpaRepository<Student, UUID> {
    List<Student> findAllBySchoolId(UUID shoolid);
}
