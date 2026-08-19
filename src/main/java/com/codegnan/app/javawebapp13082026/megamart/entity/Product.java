package com.codegnan.app.javawebapp13082026.megamart.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Product name is required")
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String name;

    @NotBlank(message = "Brand is required")
    @Size(min = 2, message = "Brand must contain at least 2 characters")
    private String brand;

    @NotBlank(message = "Category is required")
    private String category;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @NotBlank(message = "Image URL is required")
    private String image;

    @NotBlank(message = "Description is required")
    @Size(min = 10, message = "Description must contain at least 10 characters")
    @Column(length = 1000)
    private String description;

    @NotNull(message = "Rating is required")
    @DecimalMin(value = "1.0", message = "Rating must be at least 1")
    @DecimalMax(value = "5.0", message = "Rating must not exceed 5")
    private Double rating;

    @NotNull(message = "Reviews are required")
    @PositiveOrZero(message = "Reviews cannot be negative")
    private Integer reviews;

    @NotBlank(message = "Purchased count is required")
    private String purchased;


    // Default Constructor
    public Product() {
    }


    // Parameterized Constructor
    public Product(Long id,
                   String name,
                   String brand,
                   String category,
                   Double price,
                   String image,
                   String description,
                   Double rating,
                   Integer reviews,
                   String purchased) {

        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.image = image;
        this.description = description;
        this.rating = rating;
        this.reviews = reviews;
        this.purchased = purchased;
    }


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }


    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }


    public String getPurchased() {
        return purchased;
    }

    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }
}