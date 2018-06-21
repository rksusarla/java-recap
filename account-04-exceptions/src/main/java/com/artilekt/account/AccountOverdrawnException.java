package com.artilekt.account;

public class AccountOverdrawnException extends RuntimeException {
    public AccountOverdrawnException() {
    }

    public AccountOverdrawnException(String message) {
        super(message);
    }

    public AccountOverdrawnException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountOverdrawnException(Throwable cause) {
        super(cause);
    }

    public AccountOverdrawnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
