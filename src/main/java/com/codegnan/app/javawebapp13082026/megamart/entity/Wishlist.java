package com.codegnan.app.javawebapp13082026.megamart.entity;



import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Table(name = "wishlist")
@Data
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;

    private Long productId;

    private String name;

    private String brand;

    private String category;

    private String image;

    private Double price;

    private Double rating;
}