package com.wxy.oa.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:spring-activiti.xml")
public class WxyOaWorkflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxyOaWorkflowApplication.class, args);
    }

}
