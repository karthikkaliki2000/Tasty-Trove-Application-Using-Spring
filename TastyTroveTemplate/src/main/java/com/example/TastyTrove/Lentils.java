package com.example.TastyTrove;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lentils implements Ingredients {
    private boolean isChinese;
    private boolean isNorthIndian;
    private boolean isSouthIndian;

    private List<String> chineseLentilsRecipes = new ArrayList<String>();
    private List<String> northIndianLentilsRecipes = new ArrayList<String>();
    private List<String> southIndianLentilsRecipes = new ArrayList<String>();

    public Lentils() {
        Collections.addAll(chineseLentilsRecipes, "Steamed Lentils", "Ginger", "Garlic", "Soy Sauce", "Vinegar");
        Collections.addAll(northIndianLentilsRecipes, "Cooking Oil", "Lentils", "Onions", "Tomatoes", "salt");
        Collections.addAll(southIndianLentilsRecipes, "Lentils", "Salt", "Black Gram");
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
        else return "Chinese Fried Lentils";
    }

    @Override
    public List<String> getIngredientsDetail(){
        if(isNorthIndian) return northIndianLentilsRecipes;
        else if(isSouthIndian) return southIndianLentilsRecipes;
        else return chineseLentilsRecipes;
    }
}