package com.codegnan.app.javawebapp13082026.megamart.resource;

import com.codegnan.app.javawebapp13082026.megamart.entity.Product;
import com.codegnan.app.javawebapp13082026.megamart.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
//@CrossOrigin(origins = "http://localhost:5173")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://megamart-frontend-4eqe0msu8-chandana-venkats-projects.vercel.app"
})

public class ProductResource {

    @Autowired
    private ProductService productService;


    // GET All Products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


    // GET Products By Category
    @GetMapping("/category/{category}")
    public List<Product> getProductsByCategory(
            @PathVariable String category) {

        return productService.getProductsByCategory(category);
    }


    // GET Product By ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }


    // UPDATE Product
    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }


    // POST Product
    @PostMapping
    public Product saveProduct(
            @Valid @RequestBody Product product) {

        return productService.saveProduct(product);
    }


    // DELETE Product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}