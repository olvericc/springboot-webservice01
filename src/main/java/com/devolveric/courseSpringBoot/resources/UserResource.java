package com.devolveric.courseSpringBoot.resources;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devolveric.courseSpringBoot.entities.User;
@RestController
@RequestMapping (value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Eric", "olv.ericlopes@gmail.com", "71993385368", "123456");
        return ResponseEntity.ok().body(u);
    }
}
