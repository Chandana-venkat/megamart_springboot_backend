package com.codegnan.app.javawebapp13082026.megamart.service;



import com.codegnan.app.javawebapp13082026.megamart.entity.Wishlist;
import com.codegnan.app.javawebapp13082026.megamart.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public List<Wishlist> getWishlistByUser(String userEmail) {

        return wishlistRepository.findByUserEmail(userEmail);
    }

    public List<Wishlist> getExistingWishlistItem(
            String userEmail,
            Long productId) {

        return wishlistRepository.findByUserEmailAndProductId(
                userEmail,
                productId
        );
    }

    public Wishlist addToWishlist(Wishlist wishlist) {

        List<Wishlist> existing =
                wishlistRepository.findByUserEmailAndProductId(
                        wishlist.getUserEmail(),
                        wishlist.getProductId()
                );

        if (!existing.isEmpty()) {
            throw new RuntimeException(
                    "Product already exists in wishlist"
            );
        }

        return wishlistRepository.save(wishlist);
    }

    public void deleteWishlistItem(Long id) {

        wishlistRepository.deleteById(id);
    }
}