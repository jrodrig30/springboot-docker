package br.com.cod3r.springboot.controllers;

import br.com.cod3r.springboot.models.entities.Product;
import br.com.cod3r.springboot.models.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author José Rodrigo Borges
 */

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping
    public @ResponseBody Product addProduct(@Valid Product product){
        productRepository.save(product);
        return product;
    }
}
