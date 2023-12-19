package com.example.Course.Controller;

import com.example.Course.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/addReview")
    public String addReview(@RequestParam("id") Integer courseId, @RequestParam("comment") String commnet, @RequestParam("rating") double rating)
    {
        try {
            return reviewService.addReview(courseId,commnet,rating);
        }catch (Exception e)
        {
            return e.getMessage();
        }

    }
}
