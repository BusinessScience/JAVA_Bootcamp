import java.util.Scanner;

public class Task_22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i)))
                System.out.print(word.charAt(i) + " ");
        }
    }
}
