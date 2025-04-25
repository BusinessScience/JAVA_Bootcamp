public class Task_26 {

    static int add(int a, int b){
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int multi(int a, int b){
        return a * b;
    }
    static double divide(int a, int b){
        if (a == 0 || b == 0) return 0;
        return (double) a / b;
    }
    static boolean isFemale(String name){
        if (name.endsWith("a")) return true;
        else return false;
    }

    static void promotion(String name){
        if (name.endsWith("a")) System.err.println("Dzisiaj promocja dla kobiet");
        else System.out.println("Peszek");
    }


    public static void main(String[] args) {

        System.out.println(divide(0,3));
        System.out.println(isFemale("Magd"));
        promotion("Magda");
    }
}
