package br.edu.ifsp.bra.proj_zero.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @GetMapping("/user-CAILON")
    public String getMethodName() {
        return "Olá Mundooo, sou o Cailonnn!!";
    }
    
    
}
