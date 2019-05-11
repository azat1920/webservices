package com.ifmo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PostgreSQLDAO {

    private Connection connection;

    public PostgreSQLDAO(){

    }

    public PostgreSQLDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Person> getPersons(String id, String name, String surname, String age) {
        List<Person> persons = new ArrayList<>();
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(ConnectionUtil.buildQuery(id, name, surname, age));
            while (rs.next()) {
                int _id = rs.getInt("id");
                String _name = rs.getString("name");
                String _surname = rs.getString("surname");
                int _age = rs.getInt("age");

                Person person = new Person(_id, _name, _surname, _age);
                persons.add(person);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }

    public String createPerson(String id, String name, String surname, String age){
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            stmt.execute(ConnectionUtil.createPerson(id, name, surname, age));
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }

    public boolean updatePerson(String id, String name, String surname, String age) {
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(ConnectionUtil.updatePerson(id, name, surname, age));
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    public boolean deletePerson(int id) {
        try (Connection connection = ConnectionUtil.getConnection()){
            Statement stmt = connection.createStatement();
            stmt.execute(ConnectionUtil.deletePerson(id));
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }


}