package com.example.visiarte_ms.model.response;

import com.example.visiarte_ms.model.User;
import com.example.visiarte_ms.model.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponse {
    private String email;
    private String password;
    private String fullName;
    private String phoneNumber;
    private UserStatus userStatus;

    public UserResponse(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.fullName = user.getFullName();
        this.phoneNumber = user.getPhoneNumber();
        this.userStatus = user.getStatus();
    }
}
