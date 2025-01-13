package com.xworkx.foodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@AllArgsConstructor
@Entity
@Table(name = "reviews")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long reviewId;

    @Column(name = "user_id", nullable = false)
    private Integer user;

    @Column(name = "restaurant_id", nullable = false)
    private Integer restaurant;

    private Double rating;

    @Column(name = "review_text", length = 500)
    private String reviewText;

}
