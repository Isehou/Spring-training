package springcourse.lesson.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springcourse.lesson.model.SchoolClass;
import springcourse.lesson.model.Student;
import springcourse.lesson.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/school")
@AllArgsConstructor
public class SchoolController {
    private final SchoolService service;

    @GetMapping
    public List<SchoolClass> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public SchoolClass getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public SchoolClass save(@RequestBody SchoolClass school) {
        return service.save(school);
    }

    @PutMapping("/{id}")
    public SchoolClass update(@PathVariable Long id, @RequestBody SchoolClass school) {
        school.setId(id);
        return service.save(school);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
