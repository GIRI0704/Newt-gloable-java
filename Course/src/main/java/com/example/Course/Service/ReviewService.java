package com.example.Course.Service;

import com.example.Course.Entity.Course;
import com.example.Course.Entity.Review;
import com.example.Course.Repository.CourseRepo;
import com.example.Course.Repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    ReviewRepo reviewRepo;
    public String addReview(Integer courseId, String comment, double rating) throws Exception {
        Optional<Course> optionalCourse = courseRepo.findById(courseId);

        if(!optionalCourse.isPresent())
            throw new Exception("course ID is invalid");
        Course course = optionalCourse.get();
        Review review = new Review();
        review.setComment(comment);
        review.setCourse(course);

        course.getReviews().add(review);
        courseRepo.save(course);

        return "review added success with course name "+ course.getName();
    }
}
