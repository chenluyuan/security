package com.jaksona.security;

import com.alibaba.druid.support.http.StatViewServlet;
import com.jaksona.security.config.JakDBConfig;
import com.jaksona.security.config.JakMvcConfig;
import com.jaksona.security.config.JakSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.HashMap;
import java.util.Map;

/**
 * 程序入口
 * @author jaksona
 * @version 1.0
 */
public class JakApplication extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        ServletRegistration.Dynamic statViewServlet = servletContext.addServlet("statViewServlet", new StatViewServlet());
        Map<String, String> statInitParams = new HashMap<>();
        statInitParams.put("loginUsername", "druid");
        statInitParams.put("loginPassword", "druid");
        statInitParams.put("resetEnable", "true");
        statViewServlet.setInitParameters(statInitParams);
        statViewServlet.addMapping("/druid");
    }

    /**
     * Specify {@link Configuration @Configuration}
     * and/or {@link Component @Component} classes to be
     * provided to the {@linkplain #createRootApplicationContext() root application context}.
     *
     * @return the configuration classes for the root application context, or {@code null}
     * if creation and registration of a root context is not desired
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{JakDBConfig.class, JakSecurityConfig.class};
    }

    /**
     * Specify {@link Configuration @Configuration}
     * and/or {@link Component @Component} classes to be
     * provided to the {@linkplain #createServletApplicationContext() dispatcher servlet
     * application context}.
     *
     * @return the configuration classes for the dispatcher servlet application context or
     * {@code null} if all configuration is specified through root config classes.
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{JakMvcConfig.class};
    }

    /**
     * Specify the servlet mapping(s) for the {@code DispatcherServlet} &mdash;
     * for example {@code "/"}, {@code "/app"}, etc.
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * Specify filters to add and map to the {@code DispatcherServlet}.
     *
     * @return an array of filters or {@code null}
     * @see #registerServletFilter(ServletContext, Filter)
     */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        return new Filter[]{characterEncodingFilter};
    }
}
