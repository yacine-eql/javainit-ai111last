package fr.eql.ai111.java.init.demo.exception;

public class ClassWritingException extends Exception {

    public ClassWritingException(String message) {
        super(message);
    }

    public ClassWritingException(String message, Throwable cause) {
        super(message, cause);
    }
}
