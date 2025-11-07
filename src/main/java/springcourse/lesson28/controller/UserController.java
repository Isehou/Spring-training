package springcourse.lesson28.controller;

import org.springframework.web.bind.annotation.*;
import springcourse.lesson28.dto.UserModel;
import springcourse.lesson28.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String addUser(@RequestBody UserModel user) {
        return userService.addUser(user.getName(), user.getAge());
    }

    @GetMapping()
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{name}")
    public String getUser(@PathVariable String name, int age) {
        return "Имя: " + name + ", age: " + age ;
    }

}
