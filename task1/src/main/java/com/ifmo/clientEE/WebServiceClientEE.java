package com.ifmo.clientEE;

import com.ifmo.clientEE.generated.Person;
import com.ifmo.clientEE.generated.PersonServiceEE;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebServiceClientEE {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/task1-1.0/PersonServiceEE?wsdl");
        PersonServiceEE personService = new PersonServiceEE(url);
        List<Person> persons = personService.getPersonWebServicePort().getPersons();
        for (Person person : persons) {
            System.out.println("name: " + person.getName() +
                    ", surname: " + person.getSurname() + ", age: " + person.getAge());
        }
        System.out.println("Total persons: " + persons.size());
    }

}
