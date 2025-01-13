package com.xworkx.foodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity
public class DeliveryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    private Integer deliveryId;
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "delivery_person_id")
    private Integer deliveryPersonnelID;
    @Column(name = "delivery_status")
    private String deliveryStatus;
    @Column(name = "delivery_time")
    private String deliveryTime;
}
