package io.library.management.controllers;

import io.library.management.entities.Product;
import io.library.management.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Collection;

@Controller
@RequestMapping(path = "/")
public class LibraryManagementController {

    @Autowired
    private ProductService productService;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String homePage(@RequestParam(name = "search", required = false) String search, Model model) {
        System.out.println(search);
        // Retrieve products from database, check product with search query if exists
        Collection<Product> products = this.productService.getProducts(search);
        // Put data in model
        model.addAttribute("products", products);
        model.addAttribute("search", search);
        // Render HTML
        return "index";
    }

    @RequestMapping(path = "products", method = RequestMethod.GET)
    public String emptyProductForm(Model model, RedirectAttributes redirectAttributes) {
        // Create product object
        Product product = new Product();
        // Put data in model
        model.addAttribute("product", product);
        // Render HTML
        return "product-form";
    }

    @RequestMapping(path = "products/{id}", method = RequestMethod.GET)
    public String productForm(@PathVariable(name = "id", required = true) Long id, Model model) {
        // Create product object
        Product product = this.productService.getProduct(id);
        // Set messages
        // Check if remaining stock is low => Put warning message
        if (product.getRemainingStock() < 5) {
            model.addAttribute("warningMessage", "Le stock d'article est faible");
        }
        // Put data in model
        model.addAttribute("product", product);
        // Render HTML
        return "product-form";
    }

    @RequestMapping(path = {"products", "products/{id}"}, method = RequestMethod.POST)
    public String saveProduct(@Valid @ModelAttribute(value = "product") Product product, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        // Check form error
        if (bindingResult.hasErrors()) {
            model.addAttribute("product", product);
            return "product-form";
        }
        // Save product in database
        System.out.println(product);
        this.productService.saveProduct(product);
        // set message
        redirectAttributes.addFlashAttribute("successMessage", "Opération éffectuée avec succés");
        // Redirect user to home page
        return "redirect:/";
    }

    @RequestMapping(path = "products/{id}/delete", method = RequestMethod.POST)
    public String deleteProduct(@PathVariable(name = "id", required = false) Long id, Model model, RedirectAttributes redirectAttributes) {
        // Delete product from database
        this.productService.deleteProduct(id);
        // set message
        redirectAttributes.addFlashAttribute("successMessage", "Opération éffectuée avec succés");
        // Redirect user to home page
        return "redirect:/";
    }

}
