package com.ifmo.exceptions;

public class IllegalIdException extends Exception {

    private static final long serialVersionUID = -1433904102690971687L;

    public static IllegalIdException DEFAULT_INSTANCE = new IllegalIdException("wrong id");

    public IllegalIdException(String message) {
        super(message);
    }

}
