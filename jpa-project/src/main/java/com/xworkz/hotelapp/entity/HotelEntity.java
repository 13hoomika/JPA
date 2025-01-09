package com.xworkz.hotelapp.entity;


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
@Table(name = "hotel_table")
public class HotelEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "h_name")
    private String hName;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "location")
    private String location;

    @Column(name = "pincode")
    private Integer pincode;

    @Column(name = "c_no")
    private Long contact;

    @Column(name = "h_type")
    private String hType;
}

