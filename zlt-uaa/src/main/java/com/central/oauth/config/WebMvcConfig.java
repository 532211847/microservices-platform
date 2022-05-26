package com.central.oauth.config;

import com.central.common.config.DefaultWebMvcConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

/**
 * @author zlt
 * @date 2019/8/5
 */
@Configuration
public class WebMvcConfig extends DefaultWebMvcConfig {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");
    }
}