package com.nashss.se.nineam.exceptions;

public class QuestionNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -4104440351506438940L;
    public QuestionNotFoundException() {
        super();
    }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception.
     */
    public QuestionNotFoundException(String message) {
        super(message);
    }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original throwable resulting in this exception.
     */
    public QuestionNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * Exception with message and cause.
     * @param message A descriptive message for this exception.
     * @param cause The original throwable resulting in this exception.
     */
    public QuestionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}