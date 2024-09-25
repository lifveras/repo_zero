package br.edu.ifsp.bra.proj_zero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.bra.proj_zero.model.User;


@RestController
public class UserController {
    @GetMapping("/user")
    public User getMethodName() {
        return new User("Dev_Zero");
    }
}
