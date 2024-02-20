package com.example.thymeleaf.DAO;

import com.example.thymeleaf.Modals.Login;

public interface LoginDAO {

    Login findByUsername(String username);
}
