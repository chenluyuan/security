package com.jaksona.security.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * 数据库配置
 * @author jaksona
 * @version 1.0
 * @date 12/20/16
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:jdbc.properties")
public class JakDBConfig {

    @Value("${jdbc_url}")
    private String url;
    @Value("${jdbc_user}")
    private String username;
    @Value("${jdbc_pwd}")
    private String password;

    @Bean(initMethod = "init", destroyMethod = "close")
    @Scope("singleton")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        // 基本属性 url、user、password
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        // 配置初始化大小、最小、最大
        dataSource.setInitialSize(1);
        dataSource.setMinIdle(1);
        dataSource.setMaxActive(20);
        // 配置获取连接等待超时的时间
        dataSource.setMaxWait(60000);
        // 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        // 配置一个连接在池中最小生存的时间，单位是毫秒
        dataSource.setMinEvictableIdleTimeMillis(300000);
        // validation
        dataSource.setValidationQuery("SELECT 'X'");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        // 打开PSCache，并且指定每个连接上PSCache的大小
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
        // 配置监控统计拦截的filters
        List<Filter> filters = new ArrayList<>();
        filters.add(stat());
        dataSource.setProxyFilters(filters);
        return dataSource;
    }

    @Bean
    public StatFilter stat() {
        StatFilter statFilter = new StatFilter();
        statFilter.setMergeSql(true);
        return statFilter;
    }

    @Bean
    @Scope("singleton")
    public DataSourceTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

    @Bean
    @Scope("singleton")
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
