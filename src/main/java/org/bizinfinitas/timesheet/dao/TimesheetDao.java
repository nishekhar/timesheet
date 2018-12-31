package org.bizinfinitas.timesheet.dao;

import org.bizinfinitas.timesheet.domain.Timesheet;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;

@Repository
public class TimesheetDao {

    private HashMap<String, LinkedList<Timesheet>> repository = new HashMap<>();

    public void add(Timesheet timesheet) {
        LinkedList<Timesheet> userTimesheets = repository.get(timesheet.getUserName());
        if (userTimesheets == null) {
            userTimesheets = new LinkedList<>();
            repository.put(timesheet.getUserName(), userTimesheets);
        }
        userTimesheets.add(timesheet);
    }
}
