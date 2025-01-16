package com.xworkz.jobportal.repo;

import com.xworkz.jobportal.entity.JobEntity;

public interface JobRepository {
    boolean save(JobEntity job);
    int updatebyTitle(String title,String jobType);
}
