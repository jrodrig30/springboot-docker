package br.com.cod3r.springboot.controllers;

import org.springframework.web.bind.annotation.*;

import java.text.NumberFormat;

/**
 * @author José Rodrigo Borges
 */

@RestController
@RequestMapping("/calc")
public class CalcController {
    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public double sum(@PathVariable double numberOne, @PathVariable double numberTwo){
        return numberOne + numberTwo;
    }

    @GetMapping("/substract")
    public double subtract(@RequestParam(name = "a") double numberOne, @RequestParam(name = "b") double numberTwo){
        return numberOne - numberTwo;
    }
}
