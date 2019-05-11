package com.ifmo;

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
                               @QueryParam("age") String age) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.createPerson(id, name, surname, age);
    }

    @PUT
    public boolean updatePerson(@QueryParam("id") String id,
                                @QueryParam("name") String name,
                                @QueryParam("surname") String surname,
                                @QueryParam("age") String age) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.updatePerson(id, name, surname, age);
    }

    @DELETE
    public String deletePerson(@QueryParam("id") int id) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return String.valueOf(dao.deletePerson(id));
    }

}