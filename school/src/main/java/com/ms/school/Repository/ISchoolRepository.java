package com.ms.school.Repository;
import com.ms.school.Entites.School;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
/*
 * @author Abdelkhalek Guedri
 * @since 17/06/2023
 */
public interface ISchoolRepository   extends JpaRepository<School, UUID> {
}
