package io.zobic.gradlespringangular.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {


    @GetMapping
    public ResponseEntity<?> helloWorld() {
        HashMap<String, Object> response = new HashMap<>();

        response.put("message", "Hello World");
        response.put("status", 200);

        return ResponseEntity.ok(response);
    }
}
