package org.bizinfinitas.timesheet.service;

public class UserNotFoundException extends Exception {

    private String userName;

    public UserNotFoundException(String uName) {
        super();
        userName = uName;
    }
}
