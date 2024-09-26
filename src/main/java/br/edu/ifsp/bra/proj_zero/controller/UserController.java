package br.edu.ifsp.bra.proj_zero.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @GetMapping("/user-CAILON")
    public String getCailonName() {
        return "Olá Mundooo, sou o Cailonnn!!";
    }
    
    @GetMapping("/user-prof")
    public String getLuizName() {
        return "Olá mundo, sou o Prof. Luiz";
    }    
    @GetMapping("/user-gaby")
    public String getMethodName() {
        return ("Olá mundo, eu sou a Gaby! ");
    }
    
}
