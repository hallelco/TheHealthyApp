package com.example.thehealthyapp;

import java.util.ArrayList;

public class Recipe {

    private String recipeId;
    private String userId;
    private String title;
    private String description;
    private ArrayList<Ingredient> ingredients;
    private String instructions;
    private String imageUrl;
    private int likes;

    public Recipe(String recipeId, String userId, String title,
                  String description, String instructions, String imageUrl) {

        this.recipeId = recipeId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.instructions = instructions;
        this.imageUrl = imageUrl;
        this.ingredients = new ArrayList<>();
        this.likes = 0;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public double calculateTotalCalories() {
        double totalCalories = 0;

        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getIngredientNutritionInfo().getCalories();
        }

        return totalCalories;
    }

    public double calculateTotalProtein() {
        double total = 0;

        for (Ingredient ingredient : ingredients) {
            total += ingredient.getIngredientNutritionInfo().getProtein();
        }

        return total;
    }

    public double calculateTotalCarbs() {
        double totalCarbs = 0;

        for (Ingredient ingredient : ingredients) {
            totalCarbs += ingredient.getIngredientNutritionInfo().getCarbs();
        }

        return totalCarbs;
    }

    public double calculateTotalFat() {
        double total = 0;

        for (Ingredient ingredient : ingredients) {
            total += ingredient.getIngredientNutritionInfo().getFat();
        }

        return total;
    }

    public void addLike() {
        likes++;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public String getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getLikes() {
        return likes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}