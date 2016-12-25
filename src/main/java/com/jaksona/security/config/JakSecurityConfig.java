package com.jaksona.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全配置
 * @author jak
 * @version 1.0
 * @date 12/20/16
 */
@Configuration
@EnableWebSecurity
public class JakSecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .authorizeRequests()
                        .anyRequest().authenticated()
                        .and()
                    .formLogin()
                        .loginPage("/login")
                        .permitAll()
                        .and()
                    .logout()
                        .permitAll();
        }

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth
                    .inMemoryAuthentication().withUser("user").password("user").roles("USER");
        }

}
