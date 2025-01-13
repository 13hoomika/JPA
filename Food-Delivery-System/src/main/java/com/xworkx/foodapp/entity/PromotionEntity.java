package com.xworkx.foodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "promotion")
public class PromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promo_id")
    private Long promoId;
    @Column(name = "promo_code")
    private String promoCode;
    private String description;
    @Column(name = "discount_percentage")
    private Double discountPercentage;
    @Column(name = "expiry_date")
    private String expiryDate;
}
