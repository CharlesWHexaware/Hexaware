package hexa.training.testspringboot.controller;

import hexa.training.testspringboot.entity.Product;
import hexa.training.testspringboot.entity.Student;
import hexa.training.testspringboot.repository.ProductRepository;
import hexa.training.testspringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
