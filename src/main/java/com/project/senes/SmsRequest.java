package com.project.senes;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class SmsRequest {

    @NotBlank
    private final String number; //number destination
    @NotBlank
    private final String message; //message

    public SmsRequest(@JsonProperty("number") String number,
                      @JsonProperty("message") String message) {
        this.number = number;
        this.message = message;
    }

    public String getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "number='" + number + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
