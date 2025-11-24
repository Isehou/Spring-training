package springcourse.lesson.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springcourse.lesson.model.Student;
import springcourse.lesson.repository.StudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository repository;

    public List<Student> findAll() {
        return repository.findAll();
    }

    public Student findById(Long id) {
        return repository.findById(id).get();
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
