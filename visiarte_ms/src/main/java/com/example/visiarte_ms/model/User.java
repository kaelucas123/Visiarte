package com.example.visiarte_ms.model;

import com.example.visiarte_ms.model.DTO.UserDTO;
import com.example.visiarte_ms.model.enums.UserAutority;
import com.example.visiarte_ms.model.enums.UserStatus;
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

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "fisrt_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "status", nullable = false)
    private UserStatus status;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "user_autority", nullable = false)
    private UserAutority userAutority;

    public void createUser(UserDTO userDTO) {
        this.phoneNumber = userDTO.phoneNumber();
        this.firstName = userDTO.firstName();
        this.password = userDTO.password();
        this.lastName = userDTO.lastName();
        this.email = userDTO.email();
        this.userAutority = UserAutority.USER;
        this.createdAt = LocalDateTime.now();
        this.status = UserStatus.ACTIVE;
    }


    public String getFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }
}
