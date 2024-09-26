package br.edu.ifsp.bra.proj_zero.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @GetMapping("/user-gaby")
    public String getMethodName() {
        return ("Olá mundo, eu sou a Gaby! ");
    }
    
}
