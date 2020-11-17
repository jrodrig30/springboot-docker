package br.com.cod3r.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author José Rodrigo Borges
 */

@RestController
public class FirstController {
    @GetMapping(path = "/ola")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
