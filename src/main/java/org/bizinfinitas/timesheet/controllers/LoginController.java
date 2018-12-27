package org.bizinfinitas.timesheet.controllers;

import org.bizinfinitas.timesheet.domain.UserLogin;
import org.bizinfinitas.timesheet.service.LoginService;
import org.bizinfinitas.timesheet.service.PasswordMismatchException;
import org.bizinfinitas.timesheet.service.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private LoginService loginService;

    @Autowired
    public LoginController(LoginService lService) {
        loginService = lService;
    }

    @GetMapping("/login")
    public String showForm() {
        return "login";
    }

    @PostMapping("/login")
    public String postForm(UserLogin userLogin, Model model) {
        try {
            loginService.login(userLogin);
        } catch (UserNotFoundException e) {
            model.addAttribute("message", "No such user");
            return "login";
        } catch (PasswordMismatchException e) {
            model.addAttribute("message", "Password mismatched");
            return "login";
        }
        return "home";
    }
}
