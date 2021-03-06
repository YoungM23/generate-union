package com.reco.generate;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author xsq
 * @Date 2019-5-6 11:56:15
 * @Description 数据源配置
 */
@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "dataSource")
    @Qualifier("dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource masterDataSource() {
        System.out.println("========== 主数据源初始化 ==========");
        return new DruidDataSource();
    }

    @Bean(name = "logsDataSource")
    @Qualifier("logsDataSource")
    @ConfigurationProperties(prefix = "spring.lc.datasource")
    public DataSource logsDataSource() {
        System.out.println("========== 【日志中心】数据源初始化 ==========");
        return new DruidDataSource();
    }
}
