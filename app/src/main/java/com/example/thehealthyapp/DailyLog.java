package com.example.thehealthyapp;

import java.util.ArrayList;
import java.time.LocalDate;

public class DailyLog
{
    private LocalDate date;
    private ArrayList<Entry> waterEntries;
    private ArrayList<Entry> mealEntries;
    private ArrayList<Entry> activityEntries;

    public DailyLog(LocalDate date) {
        this.date = date;
        this.waterEntries = new ArrayList<>();
        this.mealEntries = new ArrayList<>();
        this.activityEntries = new ArrayList<>();
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Entry> getWaterEntries() {
        return waterEntries;
    }

    public ArrayList<Entry> getMealEntries() {
        return mealEntries;
    }

    public ArrayList<Entry> getActivityEntries() {
        return activityEntries;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setWaterEntries(ArrayList<Entry> waterEntries) {
        waterEntries = waterEntries;
    }

    public void setMealEntries(ArrayList<Entry> mealEntries) {
        mealEntries = mealEntries;
    }

    public void setActivityEntries(ArrayList<Entry> activityEntries) {
        this.activityEntries = activityEntries;
    }

    public void addWaterEntry(Entry entry) {
        if(entry instanceof WaterEntry){
            waterEntries.add(entry);
        }
    }
    public void addMealEntry(Entry entry) {
        if(entry instanceof MealEntry){
            mealEntries.add(entry);
        }
    }
    public void addActivityEntry(Entry entry) {
        if(entry instanceof ActivityEntry){
            activityEntries.add(entry);
        }
    }

    public void removeWaterEntry(Entry entry) {
        if(entry instanceof WaterEntry){
            this.waterEntries.remove(entry);
        }
    }
    public void removeMealEntry(Entry entry) {
        if(entry instanceof MealEntry){
            this.mealEntries.remove(entry);
        }
    }
    public void removeActivityEntry(Entry entry) {
        if(entry instanceof ActivityEntry){
            this.activityEntries.remove(entry);
        }
    }

    public double calculateDailyWater() {
        double totalWater = 0;

        for (Entry entry : waterEntries)
        {
                WaterEntry waterEntry = (WaterEntry) entry;
                totalWater += waterEntry.getAmountMl();
        }
        return totalWater;
    }

    public double calculateDailyCalories() {
        double totalCalories = 0;

        for (Entry entry : mealEntries) {
                MealEntry mealEntry = (MealEntry) entry;
                totalCalories += mealEntry.calculateCalories();
        }
        return totalCalories;
    }

    public double calculateBurnedCalories() {
        double totalCalories = 0;

        for (Entry entry : activityEntries) {
                ActivityEntry activityEntry = (ActivityEntry) entry;
                totalCalories += activityEntry.getBurnedCalories();
        }

        return totalCalories;
    }

    public double calculateRemainingCalories(double caloriesGoal) {
        return caloriesGoal - calculateDailyCalories();
    }

}
