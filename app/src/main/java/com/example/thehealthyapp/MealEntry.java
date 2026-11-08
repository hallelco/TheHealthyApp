package com.example.thehealthyapp;

public class MealEntry extends Entry
{
    private String mealName;
    private NutritionInfo nutritionInfo;

    public MealEntry(int id, String date, String type, String mealName, NutritionInfo nutritionInfo)
    {
        super(id, date, type);
        this.mealName = mealName;
        this.nutritionInfo = nutritionInfo;
    }

    public String getMealName() {
        return mealName;
    }

    public NutritionInfo getNutritionInfo() {
        return nutritionInfo;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public void setNutritionInfo(NutritionInfo nutritionInfo) {
        this.nutritionInfo = nutritionInfo;
    }

    public double calculateCalories() {
        return nutritionInfo.getCalories();
    }

    public double calculateProtein() {
        return nutritionInfo.getProtein();
    }

    public double calculateCarbs() {
        return nutritionInfo.getCarbs();
    }

    public double calculateFat() {
        return nutritionInfo.getFat();
    }
}
