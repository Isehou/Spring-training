package springcourse.lesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springcourse.lesson.model.SchoolClass;

public interface SchoolClassRepository extends JpaRepository<SchoolClass,Long> {
}
