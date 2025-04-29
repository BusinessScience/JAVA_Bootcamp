package projekt_2_JDBC.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public boolean insert(Person person) {
        String sql = "INSERT into people (username, email) values (?,?)";
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

    public List<Person> selectAllFromDB() {
        String sql = "SELECT id, username, email FROM people";
        List<Person> people = new ArrayList<>();
        ResultSet resultSet = null;

        try (final PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Person person = new Person();
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("username"));
                person.setEmail(resultSet.getString("email"));
                people.add(person);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            closeResultSetHelper(resultSet);
        }
        return people;
    }

    public Optional<Person> getPersonByEmail(String email) {
        String sql = "SELECT id, username, email FROM people WHERE email = ?";
        ResultSet resultSet = null;
        Person person = new Person();

        try (final PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("username"));
                person.setEmail(resultSet.getString("email"));
            } else return Optional.empty();
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();

        } finally {
            closeResultSetHelper(resultSet);
        }
        return Optional.of(person);
    }

    public int deleteById(int id) {
        int deletedRows = 0;
        String sql = "SELECT id, username, email WHERE id =?";

        try (final PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            deletedRows = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return deletedRows;
    }

    public void soutAll(List<Person> people) {
        for (Person p : people)
            System.out.println(p);
    }

    private static void closeResultSetHelper(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
