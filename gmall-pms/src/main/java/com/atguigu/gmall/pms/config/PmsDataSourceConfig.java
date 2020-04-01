package com.atguigu.gmall.pms.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/***
 * sharding-jdbc数据源配置类,实现读写分离
 */
@Configuration
public class PmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        File file = org.springframework.util.ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        javax.sql.DataSource dataSource =  MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;
    }


}