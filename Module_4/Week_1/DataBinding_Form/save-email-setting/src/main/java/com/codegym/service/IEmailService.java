package com.codegym.service;

import com.codegym.model.Email;

import java.util.List;

public interface IEmailService {
    Email findCurrentSetting();
    void editSetting(Email email);

}
