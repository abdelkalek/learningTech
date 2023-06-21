package com.ms.school.Entites;

import lombok.*;

import java.util.List;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {
    private String name;
    private String email;
    private List<Student> studentList;
}
