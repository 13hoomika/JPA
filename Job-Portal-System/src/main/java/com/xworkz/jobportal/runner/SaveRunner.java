package com.xworkz.jobportal.runner;

import com.xworkz.jobportal.entity.JobEntity;
import com.xworkz.jobportal.service.JobService;
import com.xworkz.jobportal.service.JobServiceImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class SaveRunner {
    private static JobService jobService= new JobServiceImpl();
    public static void main(String[] args) {
        List<JobEntity> jobs = new ArrayList<>();
//        jobs.add(new JobEntity(1,"Java Developer","Bangalore","3-5LPA","Full Time"));
        jobs.add(new JobEntity(null,"Java Developer","Rajajinagar, Bangalore","3-5LPA","Full Time"));
        jobs.add(new JobEntity(null,"Backend Java Developer","HSR layout, Bangalore","4.2-5.5LPA","Full Time"));
        jobs.add(new JobEntity(null,"Full-Stack Java Developer","BTM, Bangalore","1-2.5LPA","Part Time"));

        for (JobEntity saveJob :jobs){
            jobService.save(saveJob);
        }
    }
}
