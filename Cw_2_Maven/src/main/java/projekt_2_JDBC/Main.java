package projekt_2_JDBC;

import projekt_2_JDBC.model.Person;
import projekt_2_JDBC.service.ServiceDB;

public class Main {

    public static void main(String[] args) {

        ServiceDB serviceDB = new ServiceDB();
        //serviceDB.insert(new Person("Jolka", "Jolka@buziaczek.pl"));
        //serviceDB.soutAll(serviceDB.selectAllFromDB());
        System.out.println(serviceDB.getPersonByEmail("tomek@buziaczek.pl"));
    }
}
