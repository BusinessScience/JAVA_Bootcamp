import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {

        String password = "java";
        Scanner scanner = new Scanner(System.in);
        String userPass;

        do {
            System.out.println("Podaj hasło :)))");
            userPass = scanner.next();
        } while (!password.equals(userPass));

        System.out.println("Congratulation! The password is: " + password);
    }
}
