package com.codegnan.app.javawebapp13082026.megamart.resource;

import com.codegnan.app.javawebapp13082026.megamart.entity.Cart;
import com.codegnan.app.javawebapp13082026.megamart.service.CartService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
//@CrossOrigin(origins = "http://localhost:5173")
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://megamart-frontend-git-main-chandana-venkats-projects.vercel.app"
})
public class CartResource {

    @Autowired
    private CartService cartService;

    @GetMapping
    public List<Cart> getCart(
            @RequestParam String userEmail) {

        return cartService.getCartByUser(userEmail);
    }

    @PostMapping
    public Cart addToCart(@Valid @RequestBody Cart cart) {

        return cartService.addToCart(cart);
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable Long id) {

        cartService.deleteCartItem(id);
    }

    @PatchMapping("/{id}")
    public Cart updateQuantity(
            @PathVariable Long id,
            @RequestBody Cart cart) {

        return cartService.updateQuantity(id, cart.getQuantity());
    }
}