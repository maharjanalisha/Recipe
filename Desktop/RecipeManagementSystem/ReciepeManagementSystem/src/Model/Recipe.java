package Model;

public class Recipe {

    private String name;
    private String category;
    private int time;
    private String difficulty;
    private String instructions;

    // Constructor
    public Recipe(String name, String category, int time, String difficulty) {
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

    public int getTime() {
        return time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getInstructions() {
        return instructions;
    }

    // Setter
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
