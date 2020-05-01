package com.epam.izh.rd.online.exception;

public class NotAccessException extends Exception {

    public NotAccessException(String message) {
        super(message);
    }

    public NotAccessException(Throwable cause) {
        super(cause);
    }

}
