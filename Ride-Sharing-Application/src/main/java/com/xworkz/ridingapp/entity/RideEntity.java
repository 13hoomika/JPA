package com.xworkz.ridingapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Ride_sharing_Table")
@NamedQuery(name = "update", query = "UPDATE RideEntity ride SET ride.fare =: fare WHERE ride.id =: id")
public class RideEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "pickup_location")
    private String pickupLocation;

    @Column(nullable = false, name = "dropoff_location")
    private String dropoffLocation;

    @Column(nullable = false, name = "ride_time")
    private LocalDateTime rideTime;

    @Column(nullable = false)
    private Double fare;
}
