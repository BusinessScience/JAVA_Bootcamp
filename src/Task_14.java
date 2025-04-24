public class Task_14 {

    public static void main(String[] args) {
        String s = "Monika";
        char c = s.charAt(s.length()-2);
        System.out.println(c);

        char first = s.charAt(0);
        System.out.println(first);

        boolean b = s.contains("nik");
        System.out.println(b);

        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder);
    }
}
