package com.example.thymeleaf.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymeleaf.Modals.Login;

@Controller
@RequestMapping("/api")
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login/display";
    }

    @PostMapping("/login")
    public String processLogin(Login login) {
        // Process login logic here
        return "redirect:/dashboard"; // Redirect to dashboard page after successful login
    }
}
