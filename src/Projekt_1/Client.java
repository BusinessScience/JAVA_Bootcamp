package Projekt_1;

public class Client {
    private String name;
    private String surname;
    private String email;
    private int wiek;
    private Adress adress;

    public Client(){}
    public Client(String name, String surname, String email, int wiek, Adress adress ){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.wiek = wiek;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", wiek=" + wiek +
                ", adress=" + adress +
                '}';
    }
}
