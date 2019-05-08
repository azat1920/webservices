package com.ifmo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionUtil {
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/ifmo";
    private static final String JDBC_USER = "ifmo";
    private static final String JDBC_PASSWORD = "ifmo";

    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgreSQLDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER,
                    JDBC_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    public static String createPerson(int id, String name, String surname, int age) {
        StringBuilder stm = new StringBuilder("insert into persons (id, name, surname, age) ");
        StringBuilder values = new StringBuilder("values (");
        values.append(id + ", '" + name  + "', '" + surname  + "', " + age + ");");
        return stm.append(values).toString();
    }

    public static String deletePerson(int id) {
        return "delete from persons where id = '" + id + "';";
    }

    public static String updatePerson(int id, String name, String surname, String age) {
        StringBuilder stm = new StringBuilder("update persons set ");
        StringBuilder updated_values = new StringBuilder();
        List<String> params = new ArrayList<>();

        if (name != null && !name.equals("?")) params.add(makeArgForUpdate("name", name));
        if (surname != null && !surname.equals("?") ) params.add(makeArgForUpdate("surname", surname));
        if (age != null && !age.equals("?")) params.add(makeArgForUpdate("age", String.valueOf(age)));
        int k = 1;
        for (String param : params) {
            updated_values.append(param);
            if (k < params.size()) {
                updated_values.append(", ");
            }
            k++;
        }
        stm.append(updated_values  + " where id = " + id + ";");
        return stm.toString();
    }

    private static String makeArgForUpdate(String field, String value){
        return " " + field + "='" + value + "' ";
    }

}