package org.bizinfinitas.timesheet.domain;

import org.apache.commons.lang3.Validate;

public class UserLogin {
    private String userName;
    private String password;

    public UserLogin() {
        ;
    }
    public UserLogin(String uName, String pWord) {
        Validate.notEmpty(uName);
        Validate.notEmpty(pWord);
        userName = uName;
        password = pWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean passwordMatches(UserLogin other) {
        return password.equals(other.getPassword());
    }
}
