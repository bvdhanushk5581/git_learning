package com.example.thymeleaf.Service;

import com.example.thymeleaf.Modals.Login;

public interface LoginService {
    boolean authenticate(Login login);
}
