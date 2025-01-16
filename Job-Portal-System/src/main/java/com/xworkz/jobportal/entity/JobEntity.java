package com.xworkz.jobportal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_portal_table")
@NamedQuery(name = "findByTitle", query = "select jobs_table from JobEntity jobs_table where jobs_table.title =: jobTitle")
@NamedQuery(name = "UpdateByTitle", query = "update JobEntity jobs set jobs.jobType =: jType where jobs.title =: jTitle")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String location;
    @Column(name = "salary_range")
    private String salaryRange;
    @Column(name = "job_type")
    private String jobType;
}
