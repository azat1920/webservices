package com.ifmo.exceptions;

import javax.xml.ws.WebFault;

@WebFault(faultBean = "com.ifmo.exeptions.CountryServiceFault")
public class IllegalIdException extends Throwable {

    private final PersonServiceFault fault;

    public IllegalIdException(String message, PersonServiceFault fault) {
        super(message);
        this.fault = fault;
    }

    public IllegalIdException(String message, PersonServiceFault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public PersonServiceFault getFaultInfo() {
        return fault;
    }
}
