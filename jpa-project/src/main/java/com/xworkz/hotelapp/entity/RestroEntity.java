package com.xworkz.hotelapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "restro_table")
@NamedQuery(name = "fetchAllData", query = "select restro_alias from RestroEntity restro_alias")
@NamedQuery(name = "fetchByName",query = "select restro_alias from RestroEntity restro_alias where restro_alias.restroName = :name")
@NamedQuery(name = "count",query = "select count(restro_alias) from RestroEntity restro_alias where restro_alias.location = :location")
public class RestroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String restroName;
    private boolean isOpen;
    private Double rating;
    private String location;
}
