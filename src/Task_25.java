import java.util.Scanner;

public class Task_25 {

    static int f(int a) {
        return a + 2;
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static int factorial(int n){
        int a =1;
        for (int i = 1; i <= n; i++) {
            a*=i;
        }
        return a;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int a = scanner.nextInt();

        System.out.println(a + " + 2 =  " + f(a));
        sayHello();

        System.out.println(factorial(3) + factorial(5));

        System.out.println(Math.sqrt(25));
    }
}