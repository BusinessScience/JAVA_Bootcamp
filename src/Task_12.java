import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("Po zamianie: pierwsza= " + a + " a druga= " +b);
    }
}
