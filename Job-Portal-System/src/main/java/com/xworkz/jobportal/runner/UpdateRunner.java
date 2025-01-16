package com.xworkz.jobportal.runner;

import com.xworkz.jobportal.repo.JobRepository;
import com.xworkz.jobportal.service.JobService;
import com.xworkz.jobportal.service.JobServiceImpl;

public class UpdateRunner {
    private static JobService jobService = new JobServiceImpl();
    public static void main(String[] args) {
        jobService.updateByTitle("Java Developer","Part Time");
    }
}
