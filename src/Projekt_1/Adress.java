package Projekt_1;

public class Adress {
    private String ulica;
    private String miasto;
    private String kodPocztowy;

    public Adress(){}
    public Adress(String ulica, String miasto, String kodPocztowy){
        this.ulica = ulica;
        this.miasto = miasto;
        if (isValidZipCode(kodPocztowy))
        this.kodPocztowy = kodPocztowy;
        else this.kodPocztowy= null;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        if (isValidZipCode(kodPocztowy))
            this.kodPocztowy = kodPocztowy;
        else this.kodPocztowy= null;
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
