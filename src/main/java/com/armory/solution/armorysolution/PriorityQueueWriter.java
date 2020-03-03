package com.armory.solution.armorysolution;

import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueWriter implements ItemWriter<Activity> {

    static Queue<Activity> priorityQueue=new PriorityQueue<>(10, new ActivitiesComparator());
    @Override
    public void write(List<? extends Activity> activities) {
        priorityQueue.addAll(activities);
    }

}
