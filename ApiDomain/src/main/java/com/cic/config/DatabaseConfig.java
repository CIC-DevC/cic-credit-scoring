/**
 * @author ntmduyen
 * @datetime Sep 16, 2020 - 11:51:49 PM
 */
package com.cic.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConfig {

    @Value("mysql://b26d32279270bb:2a1fd86b@us-cdbr-east-02.cleardb.com/heroku_6608b6218f88c46?reconnect=true")
    private String dbUrl;

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}