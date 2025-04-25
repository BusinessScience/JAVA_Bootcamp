import java.util.Scanner;

public class Task_17 {
    public static void main(String[] args) {

        for (int i = 0; i < 51; i++) {
            if (i % 2 == 0) System.out.println(i);
        }

        System.out.println();
        for (int i = 2; i < 51; i+=2) {
            System.out.println(i);
        }

        System.out.println();
        for (int i = 10; i > 0 ; i--) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum+= i;
        }

        System.out.println("Suma liczb= " + sum);
    }
}
