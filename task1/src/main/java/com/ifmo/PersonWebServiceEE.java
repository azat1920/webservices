package com.ifmo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.sql.DataSource;

@WebService(serviceName = "PersonServiceEE")
public class PersonWebServiceEE {

    @Resource(lookup = "jdbc/ifmo")
    private DataSource dataSource;

    @WebMethod(operationName = "getAllPersons")
    public List<Person> getPersons() {
        PostgreSQLDAO dao = new PostgreSQLDAO(getConnection());
        return dao.getPersons();
    }

    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PersonWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
