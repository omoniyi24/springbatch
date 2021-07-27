package com.jayjav.springboot.springbatch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @author OMONIYI ILESANMI
 */
public class MyJobListener implements JobExecutionListener {
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("job Started");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("Job Ended " +jobExecution.getStatus().toString());
    }
}
