package com.zheng.cms.task.impl;

import com.zheng.cms.task.TestTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by liusong on 2017/10/31.
 */
@Component
public class TestTaskImpl implements TestTask {

    @Scheduled(cron = "0 0/1 * * * ?")
    @Override
    public void test() {
        System.out.println("Task");
    }
}
