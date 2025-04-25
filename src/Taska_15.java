import java.util.Scanner;

public class Taska_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.next();

        //if (name.endsWith("a") && !name.equals("Barnaba")) System.out.println("To imię żeńskie");
        //else System.out.println("Imię męskie");

        System.out.println(name.endsWith("a") ? "imię żeńskie" : "Imię męskie");
    }
}
