/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ACER
 */
public class Ingredients {
    private String name;
    private double quantity;
    private String unit;
    
    public Ingredients(String name, double quantity, String unit){
        this.name = name;
        this.quantity=quantity;
        this.unit =unit;
    }
    
    public String getName(){
        return name;
    }
    
    public double getQuantity(){
        return quantity;
    }
    
    public String getUnit(){
        return unit;
    }
    
}
