package com.jaksona.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import javax.sql.DataSource;

/**
 * 安全配置
 * @author jak
 * @version 1.0
 * @date 12/20/16
 */
@Configuration
public class JakSecurityConfig {

    @Configuration
    static class JakSecurityWebApplicationInitializer
            extends AbstractSecurityWebApplicationInitializer {

    }

    @Configuration
    @EnableWebSecurity
    static class JakWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

        private DataSource dataSource;

        @Autowired
        public JakWebSecurityConfigurer(DataSource dataSource) {
            this.dataSource = dataSource;
        }

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
                    .jdbcAuthentication()
                        .dataSource(dataSource);
        }


        @Override
        public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
        }


        @Override
        public UserDetailsService userDetailsServiceBean() throws Exception {
            return super.userDetailsServiceBean();
        }
    }

}
