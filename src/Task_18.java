public class Task_18 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        while (a != b){
            System.out.println(a);
            a++;
            if (a == 9){
                System.out.println(a);
                while (a != -10) {
                    a--;
                    System.out.println(a);
                }
                while (a != b){
                    a++;
                    System.out.println(a);
                }
                a = b;
            }
        }
    }
}
