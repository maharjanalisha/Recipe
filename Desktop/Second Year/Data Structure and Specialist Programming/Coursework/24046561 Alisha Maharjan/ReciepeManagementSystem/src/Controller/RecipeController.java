package Controller;

import Model.Recipe;
import java.util.ArrayList;
import java.util.List;

public class RecipeController {

    //  TEMP storage (acts like a database)
    private static final List<Recipe> recipes = new ArrayList<>();

    // Used for EDIT operation
    public static int editIndex = -1;
    public static int updateIndex;

    // =========================
    // CREATE
    // =========================
    public static void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    // =========================
    // READ
    // =========================
    public static List<Recipe> getAllRecipes() {
        return recipes;
    }

    // =========================
    // UPDATE
    // =========================
    public static void updateRecipe(int index, Recipe recipe) {
        if (index >= 0 && index < recipes.size()) {
            recipes.set(index, recipe);
        }
    }

    // =========================
    // DELETE
    // =========================
    public static void deleteRecipe(int index) {
        if (index >= 0 && index < recipes.size()) {
            recipes.remove(index);
        }
    }
}
