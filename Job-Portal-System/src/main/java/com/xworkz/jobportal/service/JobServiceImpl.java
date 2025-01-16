package com.xworkz.jobportal.service;

import com.xworkz.jobportal.entity.JobEntity;
import com.xworkz.jobportal.repo.JobRepoImpl;
import com.xworkz.jobportal.repo.JobRepository;

public class JobServiceImpl implements JobService{
    private JobRepository jobRepository = new JobRepoImpl();
    @Override
    public void save(JobEntity jobEntity) {
        Boolean save = jobRepository.save(jobEntity);
        if (save){
            System.out.println("Data saved");
        }else System.out.println("Data not saved");
    }

    @Override
    public void updateByTitle(String title, String jobType) {
        int row = jobRepository.updatebyTitle(title, jobType);
        if (row != 0){
            System.out.println(row + " rows updated");
        }else System.out.println(row + " rows updated");
    }
}
