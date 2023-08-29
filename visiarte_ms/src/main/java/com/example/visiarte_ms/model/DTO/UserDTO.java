package com.example.visiarte_ms.model.DTO;

import jakarta.persistence.Column;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

public record UserDTO(
        @NotBlank
        String email,
        @NotBlank
        String password,
        @NotBlank
        String firstName,
        @NotBlank
        String lastName,
        @NotBlank
        String phoneNumber
) {
}
