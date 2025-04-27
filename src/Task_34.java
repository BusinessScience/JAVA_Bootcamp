import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task_34 {

    private static void getFrequencyNumbers() {
        Map<Integer, Integer> mapa = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ile chce podać liczb: ");
        int howMany = scanner.nextInt();

        for (int i = 0; i < howMany; i++) {
            System.out.println("Podaj " + (i + 1) + "liczbę");
            int number = scanner.nextInt();
            if (mapa.containsKey(number))
                mapa.put(number, mapa.get(number) + 1);
            else mapa.put(number, 1);
        }
        for (Map.Entry<Integer, Integer> m : mapa.entrySet())
            System.out.println(m.getKey() + " wystapiła " + m.getValue() + "razy");

        mapa.forEach((k,v) -> System.err.println(k + " wystapiła " + v + " razy"));
    }

    public static void main(String[] args) {

        getFrequencyNumbers();
    }
}
