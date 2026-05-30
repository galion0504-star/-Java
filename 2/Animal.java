public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;
    protected static int count = 0;
    
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        count++;
    }
    
    public Animal() {
        this("Unknown", 0, "Unknown");
    }
    
    // ГЕТТЕРЫ
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getColor() {
        return color;
    }
    
    public static int getCount() {
        return count;
    }
    
    // СЕТТЕРЫ
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Абстрактный метод
    public abstract void makeSound();
    
    // Обычный метод
    public void showInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age + ", цвет: " + color);
    }
    
    // ПЕРЕГРУЗКА метода move
    public void move() {
        System.out.println(name + " двигается");
    }
    
    public void move(int distance) {
        System.out.println(name + " двигается на " + distance + " метров");
    }
}
