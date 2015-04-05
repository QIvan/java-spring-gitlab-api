package org.gitlab.api.exception;

/**
 * Created by Aleksey Pimenov on 05.04.2015.
 */
public class GitlabAPIException extends RuntimeException{

    private int statusCode = -1;

    public GitlabAPIException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public GitlabAPIException(String message, Throwable cause, int statusCode) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
