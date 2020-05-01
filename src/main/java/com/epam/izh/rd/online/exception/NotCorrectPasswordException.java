package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception {

    public NotCorrectPasswordException(String message) {
        super(message);
    }

    public NotCorrectPasswordException(Throwable cause) {
        super(cause);
    }

}
