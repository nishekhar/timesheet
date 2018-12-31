package org.bizinfinitas.timesheet.domain;

import java.util.Calendar;

public class Timesheet {

    private String userName;
    private Calendar dateMonday;
    private Calendar dateFriday;
    private int hrsMonday;
    private int hrsTuesday;
    private int hrsWednesday;
    private int hrsThursday;
    private int hrsFriday;

    public Timesheet() {
        dateMonday = Calendar.getInstance();
        dateMonday.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        dateFriday = Calendar.getInstance();
        dateFriday.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
    }

    public String getDateMonday() {
        return toDate(dateMonday);
    }

    private String toDate(Calendar calendar) {
        return calendar.get(Calendar.YEAR) + "-"
                + (calendar.get(Calendar.MONTH) + 1)
                + "-"
                + calendar.get(Calendar.DAY_OF_MONTH);
    }

    public void setDateMonday(Calendar dateMonday) {
        this.dateMonday = dateMonday;
    }

    public String getDateFriday() {
        return toDate(dateFriday);
    }

    public void setDateFriday(Calendar dateFriday) {
        this.dateFriday = dateFriday;
    }

    public int getHrsMonday() {
        return hrsMonday;
    }

    public void setHrsMonday(int hrsMonday) {
        this.hrsMonday = hrsMonday;
    }

    public int getHrsTuesday() {
        return hrsTuesday;
    }

    public void setHrsTuesday(int hrsTuesday) {
        this.hrsTuesday = hrsTuesday;
    }

    public int getHrsWednesday() {
        return hrsWednesday;
    }

    public void setHrsWednesday(int hrsWednesday) {
        this.hrsWednesday = hrsWednesday;
    }

    public int getHrsThursday() {
        return hrsThursday;
    }

    public void setHrsThursday(int hrsThursday) {
        this.hrsThursday = hrsThursday;
    }

    public int getHrsFriday() {
        return hrsFriday;
    }

    public void setHrsFriday(int hrsFriday) {
        this.hrsFriday = hrsFriday;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
