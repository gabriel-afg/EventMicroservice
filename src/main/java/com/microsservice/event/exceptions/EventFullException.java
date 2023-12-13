package com.microsservice.event.exceptions;

public class EventFullException extends RuntimeException {
    public EventFullException(){
        super("Evento ja está cheio");
    }
    public EventFullException(String message){
        super(message);
    }
}
