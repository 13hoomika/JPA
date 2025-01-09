package com.xworkz.hotelapp.entity;

import com.xworkz.hotelapp.constant.HotelType;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "hoteltable_one")

public class HotelOneEntity {

        @Id
        @Column(name = "hotel_id")
        private Integer id;

        @Column(name = "rating")
        private Double rating;

        @Column(name = "location")
        private String location;

        @Column(name = "hotel_name")
        private String hotelName;

        @Column(name = "c_number")
        private Long contact;

        @Column(name = "type")
        private HotelType type;

        @Column(name = "average_cost_for_two")
        private Double averageCostForTwo;

        @Column(name = "has_parking")
        private Boolean hasParking;
}
