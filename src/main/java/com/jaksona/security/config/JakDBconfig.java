package com.jaksona.security.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;

/**
 * 数据库配置
 * @author jaksona
 * @version 1.0
 */
@Configuration
public class JakDBconfig {

    @Value("${jdbc_url}")
    private String url;
    @Value("${jdbc_user}")
    private String username;
    @Value("${jdbc_pwd}")
    private String password;

    @Bean
    public DataSource dataSource() {

    }

    @Bean
    @Scope("singleton")
    public static PropertySourcePlaceHolderConfigurer placeHolderConfigurer() {
        return new PropertySourcePlaceHolderConfigurer();
    }
}
