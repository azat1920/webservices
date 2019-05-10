package com.ifmo;

import com.ifmo.exceptions.IllegalIdException;
import com.ifmo.exceptions.PersonServiceFault;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "PersonService")
public class PersonWebService {

    @WebMethod(operationName = "getPersons")
    public List<Person> getPersons() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Person> persons = dao.getPersons();
        return persons;
    }

    @WebMethod(operationName = "getPersonsById")
    public List<Person> getPersonById(@WebParam(name = "id") int _id) throws IllegalIdException {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        List<Person> persons = dao.getPersonById(_id);
        return persons;
    }


    @WebMethod(operationName = "createPerson")
    public int createPerson(@WebParam(name = "id") int _id,
                            @WebParam(name = "name") String name,
                            @WebParam(name = "surname") String surname,
                            @WebParam(name = "age") int age) throws IllegalIdException {
        checkPersonExistingById(_id);
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.createPerson(_id, name, surname, age);
    }

    @WebMethod(operationName = "updatePerson")
    public boolean updatePerson(@WebParam(name = "id") int _id,
                                @WebParam(name = "name") String name,
                                @WebParam(name = "surname") String surname,
                                @WebParam(name = "age") String age) throws IllegalIdException {
        checkPersonExistingById(_id);
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.updatePerson(_id, name, surname, age);
    }

    @WebMethod(operationName = "deletePerson")
    public boolean deletePerson(@WebParam(name = "id") int _id) throws IllegalIdException {
        checkPersonExistingById(_id);
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.deletePerson(_id);
    }

    public void checkPersonExistingById(int id) throws IllegalIdException {
        if (getPersonById(id).isEmpty()) {
            throw new IllegalIdException("There is no person in database with id: " + id, PersonServiceFault.defaultInstance());
        }
    }

}