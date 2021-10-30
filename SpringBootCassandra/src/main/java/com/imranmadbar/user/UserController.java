package com.imranmadbar.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserRepository repository;


    @GetMapping("/user-list")
    public List<UserEntity> getUsers() {
        return repository.findAll();
    }

    @GetMapping("/user-by-age/{age}")
    public List<UserEntity> getUserFilterByAge(@PathVariable int age) {
        return repository.findByAgeGreaterThan(age);
    }

    @GetMapping("/user-save")
    public String saveAUser(@RequestParam int id, @RequestParam String name, @RequestParam String address, @RequestParam int age) {
        repository.save(new UserEntity(id, name, address, age));
        return "Save Success";
    }

    @GetMapping("/user-remove/{id}")
    public String userRemove(@PathVariable int id) {
        UserEntity userObj = new UserEntity();
        userObj.setId(id);
        repository.delete(userObj);
        return "Successfully User delete !";
    }

    @GetMapping("/user-remove-all")
    public String allUserRemove() {
        repository.deleteAll();
        return "Successfully all User delete !";
    }



    @PostConstruct
    public void saveUser() {
        List<UserEntity> users = new ArrayList<>();
        users.add(new UserEntity(1001, "MD IMRAN HOSSAIN", "Dhaka", 30));
        users.add(new UserEntity(1002, "Mithila Hossain", "Dhaka", 26));
        users.add(new UserEntity(1003, "Nabila", "Dhaka", 25));
        users.add(new UserEntity(1004, "Papya", "Dhaka", 22));
        users.add(new UserEntity(1005, "Shawon", "Boriasl", 35));
        users.add(new UserEntity(1006, "Biddut", "Khulna", 25));
        repository.saveAll(users);
    }


}