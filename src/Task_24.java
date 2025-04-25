import java.util.Scanner;

public class Task_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wielkość wieżyczki: ");
        int a = scanner.nextInt();

        StringBuilder s = new StringBuilder("*");

        for (int i = 1; i <= a; i++) {
            System.out.println(s);
            s.append("*");
        }
    }
}
