package com.example.authservice.controller;

import com.example.authservice.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth/login/magic")
public class AuthController {

    @Autowired
    private MailService mailService;

    @GetMapping("/verify")
    public String verifyToken(@RequestParam String token) {
        if (token != null && token.length() > 10) {
            return "Token válido! Login realizado com sucesso.";
        } else {
            return "Token inválido!";
        }
    }

    @PostMapping("/send")
    public String sendMagicLink(@RequestParam String email) {
        String token = "iC08ZeooKK8G6L1BL_sJ-ybGMrk7kEIiEYlBFqpoPvg";
        String magicLink = "http://localhost:8080/auth/login/magic/verify?token=" + token;

        mailService.sendEmail(email, "Seu link mágico de login", "Clique aqui para logar: " + magicLink);

        return "Link mágico enviado para: " + email;
    }
}
