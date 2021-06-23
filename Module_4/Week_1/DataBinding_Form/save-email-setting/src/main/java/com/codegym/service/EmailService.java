package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public class EmailService implements IEmailService {
    private Email email = new Email();

    @Override
    public Email findCurrentSetting() {
        return email;
    }

    @Override
    public void editSetting(Email email) {
        this.email = email;
    }
}
