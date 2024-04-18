package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Wheat implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseWheatRecipes = new ArrayList<String>();
    private List<String> northIndianWheatRecipes = new ArrayList<String>();
    private List<String> southIndianWheatRecipes = new ArrayList<String>();

    public Wheat() {
        Collections.addAll(chineseWheatRecipes, "Steamed Rice", "Ginger", "Garlic", "Soy Sauce", "Vinegar");
        Collections.addAll(northIndianWheatRecipes, "Cooking Oil", "Rice", "Onions", "Tomatoes", "salt");
        Collections.addAll(southIndianWheatRecipes, "Rice", "Salt", "Black Gram");
    }

    @Override
    public void setIngredient(String ingredient) {
        if(ingredient.equals("Chinese")) this.isChinese = true;
        if(ingredient.equals("NorthIndian")) this.isNorthIndian = true;
        if(ingredient.equals("SouthIndian")) this.isSouthIndian = true;
    }

    @Override
    public String getDishDetail() {
        if(isNorthIndian) return "Biryani";
        else if(isSouthIndian) return "Idli";
        else return "Chinese Fried Rice";
    }

    @Override
    public List<String> getIngredientsDetail(){
        if(isNorthIndian) return northIndianWheatRecipes;
        else if(isSouthIndian) return southIndianWheatRecipes;
        else return chineseWheatRecipes;
    }
}