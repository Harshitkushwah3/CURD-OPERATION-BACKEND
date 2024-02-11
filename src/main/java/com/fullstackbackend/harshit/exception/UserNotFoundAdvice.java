package com.fullstackbackend.harshit.exception;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import java.util.*;

@ControllerAdvice
public class UserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)

    public Map<String, String> exceptionHandler(UserNotFoundException exception){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("error message", exception.getMessage());
        return errorMap;
    }

}
