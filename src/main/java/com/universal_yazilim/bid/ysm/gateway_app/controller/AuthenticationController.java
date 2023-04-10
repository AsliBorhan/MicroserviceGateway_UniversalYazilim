package com.universal_yazilim.bid.ysm.gateway_app.controller;

import com.universal_yazilim.bid.ysm.gateway_app.model.entity.User;
import com.universal_yazilim.bid.ysm.gateway_app.model.service.AbstractUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("api/user")
@RestController
public class AuthenticationController
{
    @Autowired
    private AbstractUserService userService;//dependency injection

    // sign-in (kullanıcı oturum açma)
    // sign-up (kullanıcı kaydı)


}
