package com.xwrokz.udemy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "udemy_table")
@NamedQuery(name = "findById", query = "SELECT udemy FROM UdemyEntity udemy WHERE udemy.id =: getId")
@NamedQuery(name = "findByName", query = "SELECT udemy FROM UdemyEntity udemy WHERE udemy.instructorName =: instructorName")
@NamedQuery(name = "updateByName", query = "UPDATE UdemyEntity udemy SET udemy.level = :lev WHERE udemy.instructorName = :name")
@Entity
public class UdemyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Column(name = "instructor_name")
    private String instructorName;
    private String level;
    private double rating;
    private double price;

}
