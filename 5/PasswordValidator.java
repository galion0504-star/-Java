import java.util.Scanner;
import java.util.regex.*;

public class PasswordValidator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите пароль: ");
            String password = scanner.nextLine();
            
            // Регулярное выражение для проверки пароля
            String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            
            if (matcher.matches()) {
                System.out.println("Пароль валиден.");
            } else {
                System.out.println("Пароль не соответствует требованиям.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка при проверке пароля: " + e.getMessage());
        }
    }
}
