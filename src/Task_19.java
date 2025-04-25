import java.util.Random;
import java.util.Scanner;

public class Task_19 {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(10);

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag){
            System.out.println("Gimme number [0 - 10]: ");
            int userNumber = scanner.nextInt();

            if (userNumber > number) System.out.println("Too big...");
            if (userNumber < number) System.out.println("Too small..");
            if (userNumber == number) {
                System.out.println("You win!!! Number= " + number );
                flag = false;
            }
        }
    }
}
