package org.example;

public enum Weekdays {
    MONDAY("9:00 - 19:00", false),
    TUESDAY("9:00 - 19:00", false),
    WEDNESDAY("9:00 - 19:00", true),
    THURSDAY("9:00 - 19:00", false),
    FRIDAY("9:00 - 13:00", true);

    private final String workingHours;
    private final boolean homeoffice;

    Weekdays(String workingHours, boolean homeoffice) {
        this.workingHours = workingHours;
        this.homeoffice = homeoffice;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public boolean isHomeoffice() {
        return homeoffice;
    }
}
