package com.example.thymeleaf.Service;

import org.springframework.stereotype.Service;

import com.example.thymeleaf.Modals.Login;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean authenticate(Login login) {
        // Simulate authentication logic
        // Replace this with your actual authentication mechanism (e.g., database check)
        String username = login.getUsername();
        String password = login.getPassword();

        // Example: Accept any non-empty username/password combination
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }
}
