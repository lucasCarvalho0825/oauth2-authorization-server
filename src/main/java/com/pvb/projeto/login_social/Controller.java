package com.pvb.projeto.login_social;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.security.Principal;


@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public ResponseEntity<Void> welcome() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("http://localhost:8080/user")).build();
    }

    @GetMapping("/hh")
    public ResponseEntity<Void> getGoogle() {
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create("https://accounts.google.com/o/oauth2/v2/auth")).build();
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
