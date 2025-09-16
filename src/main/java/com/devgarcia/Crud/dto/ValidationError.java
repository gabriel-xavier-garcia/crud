package com.devgarcia.Crud.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError{
    private List<fieldMessage> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<fieldMessage> getErrors() {
        return errors;
    }

    public void addErrors(String fieldName, String message){
        errors.add(new fieldMessage(fieldName,message));
    }
}
