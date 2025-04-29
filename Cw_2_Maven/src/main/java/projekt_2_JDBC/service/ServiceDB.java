package projekt_2_JDBC.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import projekt_2_JDBC.config.Connections_DB;
import projekt_2_JDBC.model.Person;

import static projekt_2_JDBC.config.Constants_DB_Connection.*;

public class ServiceDB {

    private Connection getConnection() {
        Connection connection = Connections_DB.createConnection(DEFAULT_DRIVER, DEFAULT_URL, DEFAULT_USER, DEFAULT_PASS);
        if (connection == null)
            return null;
        return connection;
    }

    public boolean insert(String sql, Person person) {
        try (final PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, person.getName());
            preparedStatement.setString(2, person.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Person> selectAllFromDB(String sql) {
        List<Person> people = new ArrayList<>();
        ResultSet resultSet = null;

        try (final PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setEmail(resultSet.getString("email"));
                people.add(person);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return people;
    }
}
