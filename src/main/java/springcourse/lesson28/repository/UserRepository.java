package springcourse.lesson28.repository;

import org.springframework.stereotype.Repository;
import springcourse.lesson28.dto.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final List<UserModel> users = new ArrayList<>();

    public void addUser(UserModel user) {
        users.add(user);
    }

    public List<UserModel> getAllUsers() {
        return users;
    }

    public Optional<UserModel> findByName(String name) {
        return users.stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}
