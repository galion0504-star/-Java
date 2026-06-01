public class Main {
    public static void main(String[] args) {
        
        // Создание объектов
        Cat c = new Cat("Барсик", 3, "Рыжий", "Сиамская", true, 5);
        Parrot p = new Parrot("Кеша", 2, "Зеленый", "Волнистый", 20, true);
        Fish f = new Fish("Немо", 1, "Оранжевый", "Морская", 7.5, false);

        // Вывод информации
        System.out.println("=== Информация о животных ===");
        c.showInfo();
        p.showInfo();
        f.showInfo();
   
        
        // ДЕМОНСТРАЦИЯ ГЕТТЕРОВ
        System.out.println("\n--- Использование геттеров ---");
        System.out.println("Имя кошки: " + c.getName());
        System.out.println("Возраст попугая: " + p.getAge());
        System.out.println("Цвет рыбки: " + f.getColor());
        
        // ДЕМОНСТРАЦИЯ СЕТТЕРОВ
        System.out.println("\n--- Использование сеттеров ---");
        c.setName("Мурка");
        System.out.println("Новое имя кошки: " + c.getName());
        
        // ДЕМОНСТРАЦИЯ ЗВУКОВ
        System.out.println("\n--- Кто как говорит ---");
        c.makeSound();
        p.makeSound();
        f.makeSound();
        
        // ДЕМОНСТРАЦИЯ ПЕРЕГРУЗКИ
        System.out.println("\n--- Демонстрация перегрузки ---");
        c.move();
        c.move(10);
        
        // ДЕМОНСТРАЦИЯ ПОЛИМОРФИЗМА
        System.out.println("\n--- Полиморфизм (массив животных) ---");
        Animal[] animals = {c, p, f};
        for (Animal animal : animals) {
            animal.showInfo();
        }
        
        // СТАТИЧЕСКИЙ СЧЕТЧИК
        System.out.println("\n--- Статистика ---");
        System.out.println("Всего создано животных: " + Animal.getCount());
    }
}
