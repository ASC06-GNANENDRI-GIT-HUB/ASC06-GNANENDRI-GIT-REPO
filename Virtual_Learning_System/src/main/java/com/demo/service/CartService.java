package com.demo.service;

import com.demo.entity.CourseEntity;
import com.demo.exception.ResourceNotFoundException;
import com.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private final CourseRepository courseRepository;

    // In-memory cart (shared while application is running)
    private final List<CourseEntity> cart = new ArrayList<>();

    public CartService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    // Add course to cart by course ID
    public CourseEntity addToCart(Long courseId) {
        CourseEntity course = courseRepository.findById(courseId)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with ID: " + courseId));

        cart.add(course);
        return course;
    }

    // View all courses in cart
    public List<CourseEntity> viewCart() {
        return new ArrayList<>(cart);
    }

    // Remove course from cart by course ID
    public void removeFromCart(Long courseId) {
        boolean removed = cart.removeIf(course -> course.getCourseId().equals(courseId));
        if (!removed) {
            throw new ResourceNotFoundException("Course not found in cart with ID: " + courseId);
        }
    }

    // Clear the entire cart
    public void clearCart() {
        cart.clear();
    }
}

