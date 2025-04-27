package Projekt_1;

public class zipCodeTest {
    public static void main(String[] args) {

        String[] codes = {"12-234", "234","123456","12-34h","12-234","12-2345","12-122-23", "1234567","1-2345"};
        for (String s : codes) System.out.println(s + "  --> " + isValidZipCode(s));
    }

    public static boolean isValidZipCode(String zipCode) {
        char[] kod = zipCode.toCharArray();

        if (zipCode.length() != 6 || kod[2] != 45)
            return false;

        for (int i = 0; i < kod.length; i++) {
            if (i == 2) continue;
            if(kod[i] >47 && kod[i] <58) continue;
            else return false;
        }
        return true;
    }
}
