package com.bosonit.holamundo;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return String.format("Hola %s", nombre);
    }

    @PostMapping("/useradd")
    public Persona add(@RequestBody Persona persona) {
        persona.addAge();
        return persona;
    }
}