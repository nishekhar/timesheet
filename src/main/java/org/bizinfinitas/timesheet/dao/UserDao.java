package org.bizinfinitas.timesheet.dao;

import org.bizinfinitas.timesheet.domain.UserLogin;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Repository
public class UserDao {
    HashMap<String, UserLogin> repository = new HashMap<>();

    @PostConstruct
    void load() {
        repository.put("shekharshan", new UserLogin("shekharshan", "sunshine"));
        repository.put("nishekhar", new UserLogin("nishekhar", "kikky1980"));
    }

    public UserLogin findUser(UserLogin userLogin) {
        return repository.get(userLogin.getUserName());
    }
}
