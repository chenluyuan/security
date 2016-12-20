package com.jaksona.security.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Servlet配置
 * @author jak
 * @version 1.0
 * @date 12/20/16
 */
@Configuration
public class JakServletConfig {

    @Bean
    public ServletRegistrationBean statViewRegisterBean() {
        ServletRegistrationBean servlet = new ServletRegistrationBean();
        servlet.setServlet(new StatViewServlet());
        servlet.addUrlMappings("/druid/*");
        servlet.addInitParameter("loginUsername", "druid");
        servlet.addInitParameter("loginPassword", "druid");
        servlet.addInitParameter("resetEnable", "true");
        return servlet;
    }
}
