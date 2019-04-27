package com.thinh.restfull.User;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    @Autowired
    private UserResponsitory  userResponsitory;


    @GetMapping("jpa/users")
    public List<User> retrieveAllUsers() {
        return userResponsitory.findAll();
    }

    @GetMapping("jpa/users/{id}")
    public Optional<User> retrieveUser(@PathVariable int id) {
        Optional<User> user = userResponsitory.findById(id);
        if (user==null)throw new UserNotFoundException("id-" + id);
        return user;

    }

    @DeleteMapping("jpa/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userResponsitory.deleteById(id);


    }
    @PostMapping("jpa/users")
    public ResponseEntity<Object> createUser(@RequestBody User user)
    {
        User savedUser = userResponsitory.save(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();


    }

    //
    // input - details of user
    // output - CREATED & Return the created URI

}
