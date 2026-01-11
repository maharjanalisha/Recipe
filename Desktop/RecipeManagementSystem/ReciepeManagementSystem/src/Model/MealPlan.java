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
public class MealPlan {
    private int planId;
    private String week;        //e.g. Week1
    private List<MealEntry> entries;
    
    public MealPlan(int planId, String week){
        this.planId=planId;
        this.week = week;
        this.entries= new ArrayList<>();
    }
    
    public int getPlanId(){
        return planId;
    }
    
    public String getWeek(){
        return week;
    }
    
    public List<MealEntry> getEntries(){
        return entries;
    }
    
}
