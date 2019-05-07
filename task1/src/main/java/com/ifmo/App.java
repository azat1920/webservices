package com.ifmo;

import javax.xml.ws.Endpoint;

public class App {
        public static void main(String[] args) {
            String url = "http://localhost:12345/PersonService";
            Endpoint.publish(url, new PersonWebService());
        }
}
