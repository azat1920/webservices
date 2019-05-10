package com.ifmo;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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

}