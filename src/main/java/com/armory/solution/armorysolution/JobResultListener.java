package com.armory.solution.armorysolution;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobResultListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
            //not needed
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        int size=PriorityQueueWriter.priorityQueue.size();
        while(!PriorityQueueWriter.priorityQueue.isEmpty()){
            System.out.println(PriorityQueueWriter.priorityQueue.poll());
        }
        System.out.println("Total amount of log rows processed: "+size);
    }
}
