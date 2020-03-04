package io.library.management.servicesImpl;

import io.library.management.dao.ProductRepository;
import io.library.management.entities.Product;
import io.library.management.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    public ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Boolean deleteProduct(Long id) {
        this.productRepository.deleteById(id);
        // CHeck if product exists in database
        return !this.productRepository.findById(id).isPresent();
    }

    @Override
    public Product getProduct(Long id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public Collection<Product> getProducts() {
        return this.productRepository.findAll(Sort.by(Sort.Direction.ASC, "remainaingStock"));
    }

}
