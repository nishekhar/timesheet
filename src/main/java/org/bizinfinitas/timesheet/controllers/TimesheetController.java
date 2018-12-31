package org.bizinfinitas.timesheet.controllers;

import org.bizinfinitas.timesheet.domain.Timesheet;
import org.bizinfinitas.timesheet.domain.UserLogin;
import org.bizinfinitas.timesheet.service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class TimesheetController {

    @Autowired
    private TimesheetService timesheetService;

    @GetMapping("timesheet")
    public String showForm(Model model) {
        model.addAttribute("timesheet", new Timesheet());
        return "home";
    }

    @PostMapping("timesheet")
    public String postForm(@SessionAttribute("loggedUser") UserLogin loggedUser,
                           Timesheet timesheet) {
        timesheetService.saveTimesheet(loggedUser, timesheet);
        return "submitted";
    }
}
