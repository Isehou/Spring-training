package springcourse.lesson.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import springcourse.lesson.model.SchoolClass;
import springcourse.lesson.repository.SchoolClassRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {
    private SchoolClassRepository repository;

    public List<SchoolClass> findAll() {
        return repository.findAll();
    }

    public SchoolClass findById(Long id) {
        return repository.findById(id).get();
    }

    public SchoolClass save(SchoolClass schoolClass) {
        return repository.save(schoolClass);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
