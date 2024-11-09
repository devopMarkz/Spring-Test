package com.marcos.learn_spring.resources;

import com.marcos.learn_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Marcos", "marcos@gmail.com", "98986063363", "lxgiwyl");
        return ResponseEntity.ok().body(u);
    }

}
