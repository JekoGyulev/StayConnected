package com.example.stayconnected.email;

import com.example.stayconnected.event.SuccessfulRegistrationEvent;

public interface EmailService {
    void sendEmailWhenUserRegister(SuccessfulRegistrationEvent event);
}
