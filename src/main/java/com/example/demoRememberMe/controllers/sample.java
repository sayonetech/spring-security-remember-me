package com.example.demoRememberMe.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class sample {

    @GetMapping(value = "/before-login")
    public ResponseEntity beforeLogin(){
        HashMap resp = new HashMap();
        resp.put("status","not authenticated");
        return new ResponseEntity(resp,HttpStatus.OK);
    }


    @GetMapping(value = "/after-login")
    public ResponseEntity afterLogin(){
        HashMap resp = new HashMap();
        resp.put("status","logged in");
        return new ResponseEntity(resp,HttpStatus.OK);
    }


    @GetMapping(value = "/accessDenied")
    public ResponseEntity accessDenied(){
        HashMap resp = new HashMap();
        resp.put("status","Access Denied");
        return new ResponseEntity(resp,HttpStatus.OK);
    }
}
