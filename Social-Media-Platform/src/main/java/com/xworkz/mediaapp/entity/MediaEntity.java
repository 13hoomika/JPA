package com.xworkz.mediaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "social_media_table")
@NamedQuery(name = "findUserName",query = "SELECT media FROM MediaEntity media WHERE media.userName =: uName")
@NamedQuery(name = "update",query = "UPDATE MediaEntity media SET media.followersCount =: followers WHERE media.userName =: user")
public class MediaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_name")
    private String userName;
    private String platform;
    @Column(name = "followers_count")
    private Integer followersCount;
    @Column(name = "posts_count")
    private Integer postsCount;
}
