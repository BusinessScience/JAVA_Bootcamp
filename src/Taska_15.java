import java.util.Scanner;

public class Taska_15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.next();

        //if (name.endsWith("a") && !name.equals("Barnaba")) System.out.println("To imię żeńskie");
        //else System.out.println("Imię męskie");

        System.out.println(name.endsWith("a") ? "imię żeńskie" : "Imię męskie");

        char lastLetter = name.charAt(name.length() -1);
        char firstLetter = name.toLowerCase().charAt(0);
        System.out.println(firstLetter);

        boolean answer = (lastLetter == firstLetter);
        System.out.println(answer);

    }
}
