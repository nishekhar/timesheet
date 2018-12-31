package org.bizinfinitas.timesheet.service;

import org.bizinfinitas.timesheet.dao.TimesheetDao;
import org.bizinfinitas.timesheet.domain.Timesheet;
import org.bizinfinitas.timesheet.domain.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimesheetService {

    @Autowired
    private TimesheetDao timesheetDao;

    public void saveTimesheet(UserLogin loggedUser, Timesheet timesheet) {
        timesheet.setUserName(loggedUser.getUserName());
        timesheetDao.add(timesheet);
    }
}
