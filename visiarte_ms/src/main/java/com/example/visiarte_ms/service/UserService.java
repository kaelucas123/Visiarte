package com.example.visiarte_ms.service;

import com.example.visiarte_ms.model.DTO.UserDTO;
import com.example.visiarte_ms.model.User;
import com.example.visiarte_ms.repository.UserRepository;
import com.example.visiarte_ms.resource.UserResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Service
@Slf4j
public class UserService {
    private UserRepository userRepository;

    public List<User> findAll() {
        log.info("Finding all users");
        return this.userRepository.findAll();
    }
    public User findById(UUID id) {
        log.info("Finding user by id: {}",  id);
        return this.userRepository.findById(id).orElse(null);
    }
    public User createUser(UserDTO userDTO) {
        log.info("creating user");
        User user = new User();
        user.createUser(userDTO);

        return this.userRepository.save(user);
    }

}
