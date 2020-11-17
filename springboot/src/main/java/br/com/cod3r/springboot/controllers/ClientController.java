package br.com.cod3r.springboot.controllers;

import br.com.cod3r.springboot.models.entities.Client;
import org.springframework.web.bind.annotation.*;

/**
 * @author José Rodrigo Borges
 */

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/any")
    public Client getClient(){
        return new Client(28, "Iara Kuntz Borges", "026.591.760-32");
    }

    @GetMapping("/{id}")
    public Client getClientById(@PathVariable int id){
        return new Client(id, "José Rodrigo", "018.461.340-05");
    }

    @GetMapping
    public Client getClientById2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Client(id, "Paulo Silva", "987.654.321-00");
    }
}
