package Projekt_1;

public class Main {
    public static void main(String[] args) {

        Adress adress = new Adress("jakaś", "Kraków", "51-105");
        Adress adress2 = new Adress("jakaś", "Kraków", "51105");
        Client client = new Client("Tomek", "Jakiś", "tomek@tomek.com", 23, adress);
        Client client2 = new Client("Tomek", "Jakiś", "tomek@tomek.com", 23, adress2);

        System.out.println(client.getAdress().getMiasto());
        System.out.println(client.getAdress().getKodPocztowy());
        System.out.println(client2.getAdress().getKodPocztowy());

        System.out.println(client);
    }
}
