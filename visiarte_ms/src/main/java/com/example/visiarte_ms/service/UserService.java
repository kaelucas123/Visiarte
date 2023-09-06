package com.example.visiarte_ms.service;

import com.example.visiarte_ms.model.User;
import com.example.visiarte_ms.model.request.UserRequest;
import com.example.visiarte_ms.model.response.UserResponse;
import com.example.visiarte_ms.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserResponse> findAll() {
        log.info("Finding all users");
        return this.userRepository.findAll().stream().map(UserResponse::new).collect(Collectors.toList());
    }
    public UserResponse findById(UUID id) {
        log.info("Finding user by id: {}",  id);
        Optional<User> userO = this.userRepository.findById(id);
        return userO.map(UserResponse::new).orElse(null);
    }
    public User save(UserRequest userRequest) {
        log.info("creating user");
        User user = new User();
        user.createUser(userRequest);

        return this.userRepository.save(user);
    }

}
