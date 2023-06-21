package com.ms.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;

/**
 * @author Abdelkhalek Guedri
 * @since 19/06/2023
 */
public class AlreadyExistException extends RestException{
    public AlreadyExistException( String code, String message) {
        super( HttpStatus.CONFLICT , code , message);
    }
    public AlreadyExistException( String message, Errors errors ) {
        super( HttpStatus.CONFLICT , message , errors);
    }
}
