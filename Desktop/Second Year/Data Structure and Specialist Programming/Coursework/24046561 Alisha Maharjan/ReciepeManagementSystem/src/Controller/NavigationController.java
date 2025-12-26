/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import View.MainFrame;


/**
 *
 * @author ACER
 */
public class NavigationController {
    private MainFrame mainFrame;

    public NavigationController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public void goToLogin() {
        mainFrame.showScreen("LOGIN");
    }

    public void goToAdminDashboard() {
        mainFrame.showScreen("ADMIN");
    }

    public void goToUserDashboard() {
        mainFrame.showScreen("USER");
    }

    public void goToRecipeList() {
        mainFrame.showScreen("RECIPES");
    }

    public void goToRecipeForm() {
        mainFrame.showScreen("RECIPE_FORM");
    }

    public void goToMealPlanner() {
        mainFrame.showScreen("MEAL_PLANNER");
    }

    public void goToShoppingList() {
        mainFrame.showScreen("SHOPPING_LIST");
    }
    
}
