package com.spring.email.controller;

import lombok.AllArgsConstructor;
import com.spring.email.model.Email;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.email.service.EmailService;

import javax.mail.MessagingException;

@RestController
@RequestMapping("api/email")
@AllArgsConstructor
public class EmailController {

    private EmailService emailService;

    @PostMapping
    public void sendEmail(@RequestBody Email email) throws MessagingException {
        emailService.sendEmail(email);
    }
}
