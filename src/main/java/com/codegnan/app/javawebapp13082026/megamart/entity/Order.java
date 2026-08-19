package com.codegnan.app.javawebapp13082026.megamart.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @Column(length = 50)
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Enter valid email")
    private String email;

    @NotBlank(message = "Mobile is required")
    private String mobile;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Payment method is required")
    private String payment;

    @NotNull(message = "Total is required")
    @Positive(message = "Total must be greater than zero")
    private Double total;

    @Column(name = "order_date")
    private String orderDate;

    private String date;

    private String status;

    @Valid
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "order_id")
    private List<OrderItem> items;
}