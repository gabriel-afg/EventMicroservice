package com.microsservice.event.dto;

public record EventRequestDTO(
    int maxParticipants,
    int registeredPaticipants,
    String date,
    String title,
    String description
) {
}
