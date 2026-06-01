public class Main {
    public static void main(String[] args) {

        System.out.println("=== Задание 1. Собственная HashTable ===");
        HashTable<String, Integer> table = new HashTable<>(16);

        table.put("apple", 5);
        table.put("banana", 3);
        table.put("orange", 7);

        System.out.println("Размер таблицы: " + table.size());
        System.out.println("Значение по ключу banana: " + table.get("banana"));

        table.put("banana", 10);
        System.out.println("Обновленное значение banana: " + table.get("banana"));

        System.out.println("Удалено значение по ключу apple: " + table.remove("apple"));
        System.out.println("Размер таблицы после удаления: " + table.size());
        System.out.println("Пуста ли таблица? " + table.isEmpty());

        System.out.println("\n=== Задание 2. HashMap для студентов (вариант 1) ===");
        StudentRegistry registry = new StudentRegistry();

        registry.addStudent("АБ-001", new Student("Иван", "Петров", 20, 4.5));
        registry.addStudent("АБ-002", new Student("Мария", "Иванова", 19, 4.8));
        registry.addStudent("АБ-003", new Student("Алексей", "Сидоров", 21, 3.9));

        System.out.println("Все студенты:");
        registry.printAllStudents();

        System.out.println("\nПоиск студента АБ-002:");
        System.out.println(registry.findStudent("АБ-002"));

        System.out.println("\nУдаление студента АБ-001:");
        System.out.println(registry.removeStudent("АБ-001"));

        System.out.println("\nСтуденты после удаления:");
        registry.printAllStudents();
    }
}
