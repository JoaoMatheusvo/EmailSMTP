package com.example.authservice.service.impl;

import com.example.authservice.service.MailService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class LogMailService implements MailService {

    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("=== Enviando e-mail (DEV via LOG) ===");
        System.out.println("Para: " + to);
        System.out.println("Assunto: " + subject);
        System.out.println("Conteúdo: " + body);
        System.out.println("====================================");
    }
}
