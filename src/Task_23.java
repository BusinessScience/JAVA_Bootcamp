import java.util.Scanner;

public class Task_23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" : ");
        StringBuilder stringBuilder = new StringBuilder(scanner.next());

        if (stringBuilder.toString().contentEquals(stringBuilder.reverse()))
            System.out.println("Palindrom");
        else System.out.println("Niet");
    }
}
