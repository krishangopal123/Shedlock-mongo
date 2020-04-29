package com.example.shedlockmongo;

import net.javacrumbs.shedlock.core.SchedulerLock;

import org.springframework.scheduling.annotation.Scheduled;


public class mytest {
    @Scheduled(cron = "0 */1 * * * *")
    @SchedulerLock(name = "scheduledTaskName",lockAtLeastForString = "PT5M", lockAtMostForString = "PT14M")
    public void scheduledTaskName(){
        System.out.println("hello kunal");


    }
}
