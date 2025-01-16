package com.xworkz.jobportal.service;

import com.xworkz.jobportal.entity.JobEntity;

public interface JobService {
    void save(JobEntity jobEntity);
    void updateByTitle(String title,String jobType);
}
