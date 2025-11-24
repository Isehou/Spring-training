package springcourse.lesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springcourse.lesson.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
