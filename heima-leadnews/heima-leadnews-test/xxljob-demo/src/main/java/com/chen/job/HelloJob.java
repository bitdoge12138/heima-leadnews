package com.chen.job;

import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

@Component
public class HelloJob {

    @XxlJob("demoJobHandler")
    public void helloJob() {
        System.out.println("我是一头小毛驴，我在执行任务了。。。。");
    }


}
