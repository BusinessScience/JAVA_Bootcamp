
public class Task_30 {

    private static String[] getSmallLetters(String[] tab) {

        String[] temp = new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            temp[i] = tab[i].toLowerCase();
        }
        return temp;
    }


    public static void main(String[] args) {

        Task_29.soutTab(getSmallLetters(new String[]{"R", "WERFDSF", "DDD", "CNVN"}));
    }
}
