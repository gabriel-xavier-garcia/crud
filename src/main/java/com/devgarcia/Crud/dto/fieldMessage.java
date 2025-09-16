package com.devgarcia.Crud.dto;

public class fieldMessage {
    private String fieldName;
    private String message;

    public fieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
