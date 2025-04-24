import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.println("Wynik dodawania to: " + (a+b));

        double avg = (double)(a+b)/2;
        double avg2 = (a+b)/2.0;

        System.out.println("średnia= " + avg);
        System.out.println("średnia= " + avg2);
    }
}
