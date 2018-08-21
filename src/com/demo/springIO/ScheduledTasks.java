/*package com.demo.springIO;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 3000, initialDelay= 4000)
    
    public void reportCurrentTime() throws InterruptedException {
        log.info("The time is now {} and  Current Thread : {}", dateFormat.format(new Date()),Thread.currentThread().getName());
        //Thread.sleep(5000);
    }
    
    @Scheduled(fixedDelay = 2000)
    public void reportDelay() throws InterruptedException {
        log.info("**********time is now {} And Thread : {}", dateFormat.format(new Date()),Thread.currentThread().getName());
    }
}*/