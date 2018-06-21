package com.artilekt.javaworld;

public class OutOfSpaceException extends RuntimeException {
    public OutOfSpaceException() {
    }

    public OutOfSpaceException(String message) {
        super(message);
    }

    public OutOfSpaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfSpaceException(Throwable cause) {
        super(cause);
    }

    public OutOfSpaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
