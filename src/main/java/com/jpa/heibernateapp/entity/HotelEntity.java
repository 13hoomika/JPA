package com.jpa.heibernateapp.entity;


import lombok.*;

import javax.persistence.*;

@Entity // to identify this table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "hotel_table")
@NamedQuery(name="getAllData", query="select hotel_alias from HotelEntity hotel_alias")
@NamedQuery(name = "getByName",query = "select hotel_alias from HotelEntity hotel_alias where hotel_alias.hName =: name")
@NamedQuery(name = "countField",query = "select count(hotel_alias) from HotelEntity hotel_alias where hotel_alias.rating =: hotel_rating")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

