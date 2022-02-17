package com.web.asia.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:",ignoreResourceNotFound = true)
public class GlobalProperty {
    
}
