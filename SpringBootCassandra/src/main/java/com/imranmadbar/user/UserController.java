package com.imranmadbar.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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



//    @PostConstruct
//    public void saveUser() {
//        List<UserEntity> users = new ArrayList<>();
//        users.add(new UserEntity(6437, "Nabila", "Bangalore", 50));
//        users.add(new UserEntity(3523, "Papya", "Pune", 20));
//        users.add(new UserEntity(8694, "Shawon", "Mumbai", 30));
//        users.add(new UserEntity(9854, "Biddut", "Odisha", 25));
//        repository.saveAll(users);
//    }


}