package Model;

public class Recipe {

    private String name;
    private String category;
    private String time;
    private String difficulty;
    private String instructions;

    // ✅ FIXED constructor
    public Recipe(String name, String category, String time, String difficulty) {
        this.name = name;
        this.category = category;
        this.time = time;
        this.difficulty = difficulty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getTime() {
        return time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getInstructions() {
        return instructions;
    }

    // Setters
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
