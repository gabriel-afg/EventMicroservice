package com.microsservice.event.dto;

public record EmailRequestDTO(
        String to,
        String subject,
        String body
) {
}
