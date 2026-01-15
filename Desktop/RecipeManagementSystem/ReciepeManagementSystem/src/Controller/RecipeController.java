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
    // SEARCH - LINEAR SEARCH
    // =========================
    public static List<Recipe> linearSearchByName(String keyword) {

        List<Recipe> result = new ArrayList<>();

        for (Recipe r : recipes) {
            if (r.getName().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(r);
            }
        }
        return result;
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

    public static int getTotalRecipes() {
    return recipes.size();
}


    public static int getCategoryCount() {
    return (int) recipes.stream()
            .map(r -> r.getCategory())
            .distinct()
            .count();
}

public static void loadSampleData() {

    if (!recipes.isEmpty()) return;

    Recipe r1 = new Recipe("Fried Rice", "Lunch", 45, "Medium");
    r1.setInstructions("1. Cook rice\n2. Fry vegetables\n3. Add rice and sauces\n4. Mix well");

    Recipe r2 = new Recipe("Omelette", "Breakfast", 15, "Easy");
    r2.setInstructions("1. Beat eggs\n2. Heat pan\n3. Pour eggs\n4. Fold and serve");

    Recipe r3 = new Recipe("Pasta", "Dinner", 60, "Medium");
    r3.setInstructions("1. Boil pasta\n2. Prepare sauce\n3. Mix pasta and sauce");

    Recipe r4 = new Recipe("Salad", "Vegan", 50, "Easy");
    r4.setInstructions("1. Chop vegetables\n2. Add dressing\n3. Toss well");

    Recipe r5 = new Recipe("Chicken Curry", "Dinner", 120, "Difficult");
    r5.setInstructions("1. Marinate chicken\n2. Cook spices\n3. Add chicken\n4. Simmer");

    addRecipe(r1);
    addRecipe(r2);
    addRecipe(r3);
    addRecipe(r4);
    addRecipe(r5);
}


// =========================
// SORT (Bubble Sort by Name)
// =========================
public static List<Recipe> sortByName() {

    List<Recipe> sortedList = new ArrayList<>(recipes);

    for (int i = 0; i < sortedList.size() - 1; i++) {
        for (int j = 0; j < sortedList.size() - i - 1; j++) {

            if (sortedList.get(j).getName()
                    .compareToIgnoreCase(sortedList.get(j + 1).getName()) > 0) {

                Recipe temp = sortedList.get(j);
                sortedList.set(j, sortedList.get(j + 1));
                sortedList.set(j + 1, temp);
            }
        }
    }
    return sortedList;
}


// =========================
// SEARCH - BINARY SEARCH
// =========================
public static Recipe binarySearchByName(String name) {

    List<Recipe> sorted = new ArrayList<>(recipes);

    sorted.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));

    int low = 0;
    int high = sorted.size() - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int cmp = sorted.get(mid).getName().compareToIgnoreCase(name);

        if (cmp == 0) {
            return sorted.get(mid);
        } else if (cmp < 0) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return null;
}


}
