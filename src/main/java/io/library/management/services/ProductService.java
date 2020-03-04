package io.library.management.services;

import io.library.management.entities.Product;

import java.util.Collection;

public interface ProductService {

    Product saveProduct(Product product);

    Boolean deleteProduct(Long id);

    Product getProduct(Long id);

    Collection<Product> getProducts();

}
