package io.library.management.controllers;

import io.library.management.entities.Product;
import io.library.management.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/rest/products")
public class LibraryManagementRestController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public Collection<Product> retrieveProducts() {
        return this.productService.getProducts(null);
    }

}
