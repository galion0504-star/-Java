public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;

    public Student(String firstName, String lastName, int age, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + ", фамилия: " + lastName + ", возраст: " + age + ", средний балл: " + averageGrade;
    }
}
