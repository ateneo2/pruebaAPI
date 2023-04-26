package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saluda {
    @GetMapping("/saludar/{name}")
    public String saludar(@PathVariable String name){
        return "Hola "+name;

        
    }
    
}
