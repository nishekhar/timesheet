package org.bizinfinitas.timesheet.service;

import org.bizinfinitas.timesheet.domain.UserLogin;

public class PasswordMismatchException extends Exception {

    private UserLogin failedLogin;
    public PasswordMismatchException(UserLogin uLogin) {
        super();
        failedLogin = uLogin;
    }
}
