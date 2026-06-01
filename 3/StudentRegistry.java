import java.util.HashMap;

public class StudentRegistry {
    private final HashMap<String, Student> students = new HashMap<>();

    public void addStudent(String recordBookNumber, Student student) {
        if (recordBookNumber == null || recordBookNumber.isBlank()) {
            throw new IllegalArgumentException("Номер зачетной книжки не может быть пустым");
        }
        students.put(recordBookNumber, student);
    }

    public Student findStudent(String recordBookNumber) {
        return students.get(recordBookNumber);
    }

    public Student removeStudent(String recordBookNumber) {
        return students.remove(recordBookNumber);
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
            return;
        }

        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
            System.out.println("Номер зачетки: " + entry.getKey() + " | " + entry.getValue());
        }
    }
}
