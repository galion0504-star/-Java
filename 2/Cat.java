public class Cat extends Animal {
    private String breed;
    private boolean isVaccinated;
    private int miceCaught;
    
    public Cat(String name, int age, String color, 
               String breed, boolean isVaccinated, int miceCaught) {
        super(name, age, color);
        this.breed = breed;
        this.isVaccinated = isVaccinated;
        this.miceCaught = miceCaught;
    }
    
    public Cat() {
        super("Cat", 2, "Grey");
        this.breed = "Domestic";
        this.isVaccinated = false;
        this.miceCaught = 0;
    }
    
    // ГЕТТЕРЫ
    public String getBreed() {
        return breed;
    }
    
    public boolean isVaccinated() {
        return isVaccinated;
    }
    
    public int getMiceCaught() {
        return miceCaught;
    }
    
    // СЕТТЕРЫ
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
    
    public void setMiceCaught(int miceCaught) {
        this.miceCaught = miceCaught;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + ": Мяу-мяу!");
    }
    
    @Override
    public void showInfo() {
        System.out.println("Кошка: " + name + 
                ", порода: " + breed + 
                ", возраст: " + age + 
                ", цвет: " + color + 
                ", привита: " + (isVaccinated ? "да" : "нет") + 
                ", поймано мышей: " + miceCaught);
    }
}
