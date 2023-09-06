package com.example.visiarte_ms.model.request;

import javax.validation.constraints.NotBlank;

public record UserRequest(

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
