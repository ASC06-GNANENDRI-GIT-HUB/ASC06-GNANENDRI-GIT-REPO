package com.demo.controller;

import com.demo.entity.CourseEntity;
import com.demo.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Add course to cart
    @PostMapping("/add/{courseId}")
    public String addCourseToCart(@PathVariable Long courseId) {
        CourseEntity addedCourse = cartService.addToCart(courseId);
        return "Course added to cart: " + addedCourse.getCourseName();
    }

    // View cart
    @GetMapping
    public List<CourseEntity> viewCart() {
        return cartService.viewCart();
    }

    // Remove course from cart
    @DeleteMapping("/remove/{courseId}")
    public String removeCourseFromCart(@PathVariable Long courseId) {
        cartService.removeFromCart(courseId);
        return "Course removed from cart.";
    }

    // Clear entire cart
    @DeleteMapping("/clear")
    public String clearCart() {
        cartService.clearCart();
        return "Cart cleared.";
    }
}

