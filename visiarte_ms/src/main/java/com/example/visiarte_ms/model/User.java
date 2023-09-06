package com.example.visiarte_ms.model;

import com.example.visiarte_ms.model.enums.UserAutority;
import com.example.visiarte_ms.model.enums.UserStatus;
import com.example.visiarte_ms.model.request.UserRequest;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "user")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User{

    private final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "fisrt_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "status")
    private UserStatus status;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "user_autority")
    private UserAutority userAutority;

    public void createUser(UserRequest userRequest) {
        this.phoneNumber = userRequest.getPhoneNumber();
        this.firstName = userRequest.getFirstName();
        this.password = userRequest.getPassword();
        this.lastName = userRequest.getLastName();
        this.email = userRequest.getEmail();
        this.userAutority = UserAutority.USER;
        this.createdAt = LocalDateTime.now();
        this.status = UserStatus.ACTIVE;
    }


    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
}
