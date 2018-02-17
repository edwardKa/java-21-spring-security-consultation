package com.example.demo;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/all")
    public List getUser(Principal currentUser) {
        SecurityContextHolder.getContext();
        if (true) {

            throw new RuntimeException("Gandalf: you shall not pass!");
        }

        return Arrays.asList("user 1", "user 2", currentUser.getName());
    }
}
