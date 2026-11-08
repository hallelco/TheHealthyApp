package com.example.thehealthyapp;

public class User
{
    private String userID;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String activityLevel;
    private String usersGender;
    private String weightGoal;

    public User(String userID, String name, int age, double height, double weight, String activityLevel,String usersGender, String weightGoal) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.activityLevel = activityLevel;
        this.usersGender = usersGender;
        this.weightGoal = weightGoal;
    }

    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getUsersGender() {
        return usersGender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getActivityLevel() {
        return activityLevel;
    }

    public String getWeightGoal() {
        return weightGoal;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    public void setUsersGender(String usersGender) {
        this.usersGender = usersGender;
    }

    public void setWeightGoal(String weightGoal) {
        this.weightGoal = weightGoal;
    }

    public double calculateBMR()
    {
        double bmr = 0;
        if(this.usersGender.equals("female"))
        {
            bmr += ((this.weight * 10) + (this.height * 6.25) - (this.age * 5) - 161);
        }
        if(this.usersGender.equals("male"))
        {
            bmr += ((this.weight * 10) + (this.height * 6.25) - (this.age * 5) + 5);
        }
       return bmr;
    }

    public double calculateTDEE()
    {
        double newBMR = calculateBMR()
        ;

        if (this.activityLevel.equals("low")) {
            newBMR *= 1.2;
        }
        else if (this.activityLevel.equals("medium")) {
            newBMR *= 1.375;
        }
        else if (this.activityLevel.equals("high")) {
            newBMR *= 1.55;
        }

        return newBMR;
    }

    public double calculateCaloriesGoal()
    {
        double tdee = calculateTDEE();

        if (weightGoal.equalsIgnoreCase("lose weight")) {
            tdee = tdee * 0.85;
        }
        else if (weightGoal.equalsIgnoreCase("gain weight")) {
            tdee = tdee * 1.10;
        }
        return tdee;
    }

    public double calculateWaterGoal()
    {
        double waterGoal =calculateTDEE();
        waterGoal = waterGoal/1000;
        return waterGoal;
    }


}
