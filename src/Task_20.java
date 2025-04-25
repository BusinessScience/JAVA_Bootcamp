import java.util.Random;
import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       // int number = random.nextInt(49) + 1;
        int[] tab = new int[6];
        int[] tab2 = new int[6];
        int[] tab3 = new int[6];

        for (int i = 0; i < 6; i++) {
            int number = random.nextInt(49) + 1;
            tab[i] = number;
        }

        int count = 1;
        while (count != 7){
            System.out.println("Podaj " + count + " liczbę: ");
            int a = scanner.nextInt();
            tab2[count-1] = a;
            count++;
        }

        int check = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (tab[i] == tab2[j]){
                    tab3[check] = tab2[j];
                    check++;
                }
            }
        }

        System.out.println("Zgadłeś " + check + " liczb!");
        for (int i = 0; i < check; i++) {
            System.err.println(tab3[i]);
        }
    }
}
