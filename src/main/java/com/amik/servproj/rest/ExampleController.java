package com.amik.servproj.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    @GetMapping("/beep")
    public ResponseEntity<String> beep() {
        return ResponseEntity.ok("beep");
    }
}
