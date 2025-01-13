package com.xworkx.foodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DeliveryPersonnel")
public class DeliveryPersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "availability_status")
    private Boolean availabilityStatus;

}
