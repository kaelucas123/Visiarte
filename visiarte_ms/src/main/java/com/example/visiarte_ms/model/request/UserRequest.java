package com.example.visiarte_ms.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
        @NotBlank
        private String email;
        @NotBlank
        private String password;
        @NotBlank
        private String firstName;
        @NotBlank
        private String lastName;
        @NotBlank
        private String phoneNumber;
}
