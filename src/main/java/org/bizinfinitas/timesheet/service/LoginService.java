package org.bizinfinitas.timesheet.service;

import org.bizinfinitas.timesheet.dao.UserDao;
import org.bizinfinitas.timesheet.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private UserDao userDao;

    @Autowired
    public LoginService(UserDao uDao){
        userDao = uDao;
    }

    public UserLogin login(UserLogin givenLogin) throws UserNotFoundException,
            PasswordMismatchException {
        UserLogin storedLogin = userDao.findUser(givenLogin);
        if (storedLogin == null) {
            throw new UserNotFoundException(givenLogin.getUserName());
        }
        if (!storedLogin.passwordMatches(givenLogin)) {
            throw new PasswordMismatchException(givenLogin);
        }
        return storedLogin;
    }
}
