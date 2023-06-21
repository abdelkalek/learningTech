package com.ms.school.Services.Client;
import com.ms.school.Entites.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
@FeignClient(name="student-service",url = "${application.config.students-url}")
public interface IstudentClient {
    @GetMapping("school/{shoolid}")
     List<Student> findAllBySchoolUuid(@PathVariable("shoolid") UUID shoolid);
}
