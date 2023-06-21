package com.ms.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;

/**
 * @author Abdelkhalek Guedri
 * @since 18/06/2023
 */
public class RestException extends RuntimeException {
    public  static final long serialVersionUID = -85576001547875L;
    private final HttpStatus httpStatus;
    private final String code;
    private final String message;
    private final transient Object data;
    private final Errors errors;

    public RestException(HttpStatus httpStatus, String code) {
        super(code);
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = null;
        this.data = null;
        this.errors = null;
    }

    public RestException(HttpStatus httpStatus, String code, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
        this.data = null;
        this.errors = null;
    }

    public RestException(HttpStatus httpStatus, String code, String message, Object data) {
        super(message);
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
        this.data = data;
        this.errors = null;

    }

    public RestException(HttpStatus httpStatus, String message, Errors errors) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.errors = errors;
        this.code = null;
        this.data = null;
    }


}
