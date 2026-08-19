package com.codegnan.app.javawebapp13082026.megamart.service;


import com.codegnan.app.javawebapp13082026.megamart.entity.Cart;
import com.codegnan.app.javawebapp13082026.megamart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getCartByUser(String userEmail) {
        return cartRepository.findByUserEmail(userEmail);
    }

    public List<Cart> getExistingCartItem(String userEmail, Long productId) {
        return cartRepository.findByUserEmailAndProductId(userEmail, productId);
    }

    public Cart addToCart(Cart cart) {
        return cartRepository.save(cart);
    }


    public void deleteCartItem(Long id) {
        cartRepository.deleteById(id);
    }

    public Cart updateQuantity(Long id, Integer quantity) {

        Cart cart = cartRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cart item not found"));

        cart.setQuantity(quantity);

        return cartRepository.save(cart);
    }
}