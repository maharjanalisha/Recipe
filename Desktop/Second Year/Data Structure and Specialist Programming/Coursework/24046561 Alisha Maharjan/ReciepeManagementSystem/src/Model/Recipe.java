/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Recipe {
    private int recipeId;
    private String name;
    private int cookTime;
    private String category;
    private List<Ingredients> ingredients;
    private List<String> steps;
    
    public Recipe(int recipeId, String name, int cookTime, String category){
        this.recipeId = recipeId;
        this.name= name;
        this.cookTime=cookTime;
        this.category=category;
        this.ingredients=new ArrayList<>();
        this.steps=new ArrayList<>();
    }
    
    public int getREcipeId() {
        return recipeId;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCookTime(){
        return cookTime;
    }
    
    public String getCategory(){
        return category;
    }
    
    public List<Ingredients> getIngredients(){
        return ingredients;
    }
    
    public List<String> getSteps(){
        return steps;
    }
    
}
