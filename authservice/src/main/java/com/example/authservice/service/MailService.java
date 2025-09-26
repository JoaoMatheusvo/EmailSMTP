package com.example.authservice.service;

public interface MailService {
    void sendEmail(String to, String subject, String body);
}
