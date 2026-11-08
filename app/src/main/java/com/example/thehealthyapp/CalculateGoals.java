package com.example.thehealthyapp;
import java.util.Map;

public interface CalculateGoals {
    public double calculateWaterGoal();
    public double calculateCaloriesGoal();
    public Map<String, Integer> getWeeklySummary();
}
