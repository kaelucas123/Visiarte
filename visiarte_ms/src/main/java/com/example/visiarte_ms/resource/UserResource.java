package com.example.visiarte_ms.resource;

import com.example.visiarte_ms.model.DTO.UserDTO;
import com.example.visiarte_ms.model.User;
import com.example.visiarte_ms.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.List;
import java.util.UUID;

@RestController(value = "/user")
public class UserResource {
    private UserService userService;

    @GetMapping(value = "/{id}")
    public DeferredResult<ResponseEntity<User>> findById(@PathVariable UUID id) {
        DeferredResult<ResponseEntity<User>> dr = new DeferredResult<>();
        dr.setResult(ResponseEntity.ok().body(this.userService.findById(id)));
        return dr;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok().body(userService.findAll());
    }
    @PostMapping
    public DeferredResult<ResponseEntity<User>> createUser(@RequestBody UserDTO userDTO){
        DeferredResult<ResponseEntity<User>> dr = new DeferredResult<>();
        dr.setResult(ResponseEntity.ok().body(userService.createUser(userDTO)));
        return dr;
    }
}
