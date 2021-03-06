package com.wxy.backend.config;

import com.wxy.backend.utils.IdGen;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;


/**
 * author:noven.zhen
 * date
 */
@Configuration
public class ActivitiConfig implements ProcessEngineConfigurationConfigurer {

    @Override
    public void configure(SpringProcessEngineConfiguration springProcessEngineConfiguration) {
        springProcessEngineConfiguration.setIdGenerator(new IdGen());
    }

}
