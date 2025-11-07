package springcourse.lesson28.service;

import org.springframework.stereotype.Service;
import springcourse.lesson28.dto.UserModel;
import springcourse.lesson28.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser(String name, int age) {
        if(name == null) {
            return "Ошибка: имя не может быть пустым";
        }
        if(age < 0 && age > 100) {
            return "Некорректный возраст!";
        }

        userRepository.addUser(new UserModel(name, age));
        return "Пользователь добавлен";
    }

    public List<UserModel> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
