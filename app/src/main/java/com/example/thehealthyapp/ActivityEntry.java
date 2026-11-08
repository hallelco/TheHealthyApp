package com.example.thehealthyapp;

public class ActivityEntry extends Entry {

    private String activityName;
    private int minutesOfActivity;
    private double burnedCalories;

    public ActivityEntry(int id, String date, String type, String activityName, int minutesOfActivity, double burnedCalories)
    {
        super(id, date, type);
        this.activityName = activityName;
        this.minutesOfActivity = minutesOfActivity;
        this.burnedCalories = burnedCalories;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getMinutesOfActivity() {
        return minutesOfActivity;
    }

    public void setMinutesOfActivity(int durationMinutes) {
        this.minutesOfActivity = minutesOfActivity;
    }

    public double getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(double burnedCalories) {
        this.burnedCalories = burnedCalories;
    }
}