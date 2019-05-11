package com.ifmo.client;

import com.ifmo.Person;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    private static final String URL = "http://localhost:12345/rest/persons";

    public static void main(String[] args) {
        Client client = Client.create();

        List<String> params = new ArrayList<>();
        params.addAll(Arrays.asList(args));
        System.out.println(params.toString());
        switch (params.get(0)){
            case ("show"):
                getPersons(client, params.get(1), params.get(2), params.get(3), params.get(4));
                break;
            case ("create"):
                create(client, params.get(1), params.get(2), params.get(3), params.get(4));
                break;
            case ("update"):
                update(client, params.get(1), params.get(2), params.get(3), params.get(4));
                break;
            case ("delete"):
                delete(client, params.get(1));
                break;
            default:
                System.out.println("Undefined operation");
        }

    }

    private static void getPersons(Client client, String id, String name, String surname, String age) {
        WebResource webResource = client.resource(URL);
        webResource =   webResource.queryParam("id", id).
                                    queryParam("name", name).
                                    queryParam("surname", surname).
                                    queryParam("age", age);

        ClientResponse response =
                webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        GenericType<List<Person>> type = new GenericType<List<Person>>() {};
        System.out.println(response.getEntity(type));
    }

    private static void create(Client client, String id, String name, String surname, String age) {
        WebResource webResource = client.resource(URL);
        webResource =    webResource.queryParam("id", id)
                                    .queryParam("name", name)
                                    .queryParam("surname", surname)
                                    .queryParam("age", age);

        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }

        GenericType<String> type = new GenericType<String>() {};
        System.out.println(response.getEntity(type));
    }

    private static void update(Client client, String id, String name, String surname, String age) {
        WebResource webResource = client.resource(URL);
        webResource =    webResource.queryParam("id", id)
                                    .queryParam("name", name)
                                    .queryParam("surname", surname)
                                    .queryParam("age", age);

        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).put(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }

        GenericType<String> type = new GenericType<String>() {};
        System.out.println(response.getEntity(type));
    }

    private static void delete(Client client, String id) {
        WebResource webResource = client.resource(URL);
        webResource = webResource.queryParam("id", id);

        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).delete(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }

        GenericType<String> type = new GenericType<String>() {};
        System.out.println(response.getEntity(type));
    }
}