package com.ifmo;

import com.ifmo.exceptions.IllegalIdException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/persons")
@Produces({MediaType.APPLICATION_JSON})
public class PersonResource {

    @GET
    public List<Person> getPersons(@QueryParam("id") String id,
                                   @QueryParam("name") String name,
                                   @QueryParam("surname") String surname,
                                   @QueryParam("age") String age) {
        List<Person> persons = new PostgreSQLDAO().getPersons(id, name, surname, age);
        return persons;
    }

    @POST
    public String createPerson(@QueryParam("id") String id,
                               @QueryParam("name") String name,
                               @QueryParam("surname") String surname,
                               @QueryParam("age") String age) throws IllegalIdException {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        checkPersonExistingById(String.valueOf(id));
        return dao.createPerson(id, name, surname, age);
    }

    @PUT
    public boolean updatePerson(@QueryParam("id") String id,
                                @QueryParam("name") String name,
                                @QueryParam("surname") String surname,
                                @QueryParam("age") String age) throws IllegalIdException {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        checkPersonExistingById(String.valueOf(id));
        return dao.updatePerson(id, name, surname, age);
    }

    @DELETE
    public String deletePerson(@QueryParam("id") int id) throws IllegalIdException {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        checkPersonExistingById(String.valueOf(id));
        return String.valueOf(dao.deletePerson(id));
    }


    private void checkPersonExistingById(String id) throws IllegalIdException {
        if (getPersons(id, null, null, null).isEmpty()) {
            throw new IllegalIdException("There is no person in database with id: " + id);
        }
    }
}