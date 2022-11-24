package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts() {
        return productRepository.findAll();

    }

    public void addNewProduct(Product product) {
        Optional<Product> productOptional = productRepository
        .findProductByEmail(product.getEmail());
        if (productOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        boolean exists = productRepository.existsById(productId);
        if(!exists) {
            throw new IllegalStateException("product with id " + productId + "doesn't exist");
        }
        productRepository.deleteById(productId);
    }

    @Transactional
    public void updateProduct(Long productId, String name, String email) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalStateException("product with id " + "doesn't exist"));
        Optional<Product> productOptional = productRepository
                .findProductByEmail(product.getEmail());

        if (name != null && name.length() > 0 && !Objects.equals(product.getName(), name)){product.setName(name);}

        if (email != null && name.length() > 0 && !Objects.equals(product.getEmail(), email)){
            if (productOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            product.setEmail(email);
        }

    }
}
