package com.ifmo.client;


import com.ifmo.client.generated.IllegalIdException;
import com.ifmo.client.generated.Person;
import com.ifmo.client.generated.PersonService;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebServiceClient {


    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:12344/PersonService?wsdl");
        PersonService personService = new PersonService(url);

        List<String> params = new ArrayList<>();
        params.addAll(Arrays.asList(args));

        switch (params.get(0)){
            case ("show"):
                getPersons(personService);
                break;
            case ("create"):
                create(personService, params.get(1), params.get(2), params.get(3), params.get(4));
                break;
            case ("update"):
                update(personService, params.get(1), params.get(2), params.get(3), params.get(4));
                break;
            case ("delete"):
                delete(personService, params.get(1));
                break;
            default:
                System.out.println("Undefined operation");
        }

    }


    private static void getPersons(PersonService personService){
        List<Person> persons = personService.getPersonWebServicePort().getPersons();
        for (Person person : persons) {
            System.out.println("id:" + person.getId() + ", name: " + person.getName() +
                    ", surname: " + person.getSurname() + ", age: " + person.getAge());
        }
        System.out.println("Total persons: " + persons.size());
    }

    private static void create(PersonService personService, String id, String name, String surname, String age) {
        try {
            System.out.println(personService.getPersonWebServicePort().createPerson(Integer.parseInt(id), name, surname,
                                                                                         Integer.parseInt(age)));
        } catch (IllegalIdException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void update(PersonService personService, String id, String name, String surname, String age) {
        try {
            System.out.println(personService.getPersonWebServicePort().updatePerson(Integer.parseInt(id), name,
                                                                                        surname, age));
        } catch (IllegalIdException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void delete(PersonService personService, String id) {
        try {
            System.out.println(personService.getPersonWebServicePort().deletePerson(Integer.parseInt(id)));
        } catch (IllegalIdException e) {
            System.out.println(e.getMessage());
        }
    }
}