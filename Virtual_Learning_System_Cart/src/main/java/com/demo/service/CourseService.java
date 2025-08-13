package com.demo.service;

import com.demo.entity.CourseEntity;
import com.demo.exception.ResourceNotFoundException;
import com.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    public List<CourseEntity> searchByAuthor(String author) {
        return courseRepository.findByAuthorNameContainingIgnoreCase(author);
    }

    public List<CourseEntity> searchByName(String name) {
        return courseRepository.findByCourseNameContainingIgnoreCase(name);
    }

    public CourseEntity addCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    public void deleteCourse(Long id) {
        if (!courseRepository.existsById(id)) {
            throw new ResourceNotFoundException("Course not found");
        }
        courseRepository.deleteById(id);
    }
}

