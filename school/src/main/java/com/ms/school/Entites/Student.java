package com.ms.school.Entites;

import lombok.*;

/**
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstname;
    private String lastname;
    private String email;
}
