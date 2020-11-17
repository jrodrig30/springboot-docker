package br.com.cod3r.springboot.models.repositories;

import br.com.cod3r.springboot.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author José Rodrigo Borges
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
