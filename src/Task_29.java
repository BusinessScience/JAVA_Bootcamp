
public class Task_29 {

    private static String[] getOnlyLettersLong(String[] words, int howLong) {
        int count = 0;

        for (String s : words) {
            if (s.length() == howLong)
                count++;
        }

        String[] temp = new String[count];

        int j = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == howLong) {
                temp[j] = words[i];
                j++;
            }
        }
        return temp;
    }

    protected static void soutTab(String[] tab) {
        for (String i : tab) System.out.print(i + " | ");
    }

    public static void main(String[] args) {

        String[] words = new String[]{"12345", "123", "21", "54321", "132", "12", "13245", "123", "22", "1", "123456"};

        soutTab(getOnlyLettersLong(words, 4));
    }
}
