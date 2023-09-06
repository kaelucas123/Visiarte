package com.example.visiarte_ms.model.response;

import com.example.visiarte_ms.model.enums.UserStatus;

public record UserResponse(
        String email,
        String password,
        String firstName,
        String lastName,
        String phoneNumber,
        UserStatus userStatus

) {
}
