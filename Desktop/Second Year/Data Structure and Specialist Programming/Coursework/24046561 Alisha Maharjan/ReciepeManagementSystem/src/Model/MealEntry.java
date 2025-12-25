/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class MealEntry {
    private String day;  //sun,mon...
    private MealType mealType;   //breakfast/lunch/dinner
    private Recipe recipe;
    
    public MealEntry(String day, MealType mealType, Recipe recipe){
        this.day=day;
        this.mealType=mealType;
        this.recipe=recipe;
    }
    
    public String getDay(){
        return day;
    }
    
    public MealType getMealType(){
        return mealType;
    }
    
    public Recipe getRecipe(){
        return recipe;
    }
}
