package com.codegnan.app.javawebapp13082026.megamart.resource;



import com.codegnan.app.javawebapp13082026.megamart.entity.Wishlist;
import com.codegnan.app.javawebapp13082026.megamart.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/wishlist")
@CrossOrigin(origins = "http://localhost:5173")
public class WishlistResource {

    @Autowired
    private WishlistService wishlistService;

    @GetMapping
    public List<Wishlist> getWishlist(
            @RequestParam String userEmail) {

        return wishlistService.getWishlistByUser(userEmail);
    }

    @PostMapping
    public Wishlist addToWishlist(
            @RequestBody Wishlist wishlist) {

        return wishlistService.addToWishlist(wishlist);
    }

    @DeleteMapping("/{id}")
    public void deleteWishlistItem(
            @PathVariable Long id) {

        wishlistService.deleteWishlistItem(id);
    }
}
