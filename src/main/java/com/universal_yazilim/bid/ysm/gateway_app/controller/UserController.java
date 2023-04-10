package com.universal_yazilim.bid.ysm.gateway_app.controller;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import com.universal_yazilim.bid.ysm.gateway_app.model.service.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("api/user")
@RestController
public class UserController
{
    @Autowired
    private AbstractUserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user)
    {
        user.setCreated(new Date());

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        User savedUser = userService.save(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll()
    {
        List<User> userList = userService.getAll();

        return ResponseEntity.ok(userList);
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteByID(@PathVariable(name = "id") Integer userID)
    {
        userService.deleteByID(userID);

        return ResponseEntity.ok("userID: " + userID + " has been deleted.");
    }



}
