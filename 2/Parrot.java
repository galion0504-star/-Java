public class Parrot extends Animal {
    private String species;
    private int wordsKnown;
    private boolean canFly;
    
    public Parrot(String name, int age, String color,
                  String species, int wordsKnown, boolean canFly) {
        super(name, age, color);
        this.species = species;
        this.wordsKnown = wordsKnown;
        this.canFly = canFly;
    }
    
    public Parrot() {
        super("Parrot", 1, "Green");
        this.species = "Budgie";
        this.wordsKnown = 5;
        this.canFly = true;
    }
    
    // ГЕТТЕРЫ
    public String getSpecies() {
        return species;
    }
    
    public int getWordsKnown() {
        return wordsKnown;
    }
    
    public boolean isCanFly() {
        return canFly;
    }
    
    // СЕТТЕРЫ
    public void setSpecies(String species) {
        this.species = species;
    }
    
    public void setWordsKnown(int wordsKnown) {
        this.wordsKnown = wordsKnown;
    }
    
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + ": Привет! Хорошая птичка!");
    }
    
    @Override
    public void showInfo() {
        System.out.println("Попугай: " + name + 
                ", вид: " + species + 
                ", возраст: " + age + 
                ", цвет: " + color + 
                ", знает слов: " + wordsKnown + 
                ", умеет летать: " + (canFly ? "да" : "нет"));
    }
}
