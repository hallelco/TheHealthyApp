package com.example.thehealthyapp;

public class Ingredient
{
    private String ingredientName;
    private String ingredientAmount;
    private String ingredientUnit;
    private NutritionInfo ingredientNutritionInfo;

    public Ingredient(String ingredientName, String ingredientAmount, NutritionInfo ingredientNutritionInfo, String ingredientUnit) {
        this.ingredientName = ingredientName;
        this.ingredientAmount = ingredientAmount;
        this.ingredientNutritionInfo = ingredientNutritionInfo;
        this.ingredientUnit = ingredientUnit;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public String getIngredientUnit() {
        return ingredientUnit;
    }

    public String getIngredientAmount() {
        return ingredientAmount;
    }

    public NutritionInfo getIngredientNutritionInfo() {
        return ingredientNutritionInfo;
    }

    public void setIngredientUnit(String ingredientUnit) {
        this.ingredientUnit = ingredientUnit;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setIngredientAmount(String ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public void setIngredientNutritionInfo(NutritionInfo ingredientNutritionInfo) {
        this.ingredientNutritionInfo = ingredientNutritionInfo;
    }
}


