public class Task_32 {

    private static void showDigitsFromString(String s){
        char[] chars = s.toCharArray();
        for (char c : chars)
            if (c > 47 && c < 58) System.out.print(c + " | ");
    }

    public static void main(String[] args) {

        showDigitsFromString(new String("Al has 2 cats and 3 dogs nad 1 elephant and 0 xxx"));
    }
}
