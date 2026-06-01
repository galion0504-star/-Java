public class Fish extends Animal {
    private String waterType;
    private double length;
    private boolean isPredator;
    
    public Fish(String name, int age, String color,
                String waterType, double length, boolean isPredator) {
        super(name, age, color);
        this.waterType = waterType;
        this.length = length;
        this.isPredator = isPredator;
    }
    
    public Fish() {
        super("Fish", 1, "Gold");
        this.waterType = "Fresh";
        this.length = 10.0;
        this.isPredator = false;
    }
    
    // ГЕТТЕРЫ
    public String getWaterType() {
        return waterType;
    }
    
    public double getLength() {
        return length;
    }
    
    public boolean isPredator() {
        return isPredator;
    }
    
    // СЕТТЕРЫ
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public void setPredator(boolean predator) {
        isPredator = predator;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + ": ... (рыба молчит)");
    }
    
    @Override
    public void showInfo() {
        System.out.println("Рыбка: " + name + 
                ", тип воды: " + waterType + 
                ", возраст: " + age + 
                ", цвет: " + color + 
                ", длина: " + length + " см" + 
                ", хищник: " + (isPredator ? "да" : "нет"));
    }
}
