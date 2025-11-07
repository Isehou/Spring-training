package springcourse.lesson28.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return ("Hello, " + name + "!");
    }

    @GetMapping("/user/{name}")
    public String user(@PathVariable String name) {
        return "user " + name;
    }

    @GetMapping("/info")
    public String info(@RequestParam String name, @RequestParam int age) {
        return "info: name " + name + " & age: " + age;
    }

    @GetMapping("/sum")
    public String sum(@RequestParam int a, @RequestParam int b) {
        int i = a + b;
        return a + " + " + b + " = " + i;
    }

    @GetMapping("/movie/{name}/{year}")
    public String movie(@PathVariable String name, @PathVariable int year) {
        return "movie " + name + " " + year;
    }
}
