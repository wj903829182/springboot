package com.jack.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by jackc on 2017/7/20.
 */
@Configuration
public class MybatisConfig {
    /**
     * 注入环境变量的值
     */
    @Autowired
    private Environment environment;

    /**
     * 获取数据源DataSource
     * @return
     */
    @Bean
    public DataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(environment.getProperty("spring.datasource.url"));
        druidDataSource.setUsername(environment.getProperty("spring.datasource.username"));
        druidDataSource.setPassword(environment.getProperty("spring.datasource.password"));
        druidDataSource.setDriverClassName(environment.getProperty("spring.datasource.driverClassName"));
        druidDataSource.setMaxActive(Integer.parseInt(environment.getProperty("spring.datasource.maxActive")));
        druidDataSource.setInitialSize(Integer.parseInt(environment.getProperty("spring.datasource.initialSize")));
        druidDataSource.setMaxWait(Long.parseLong(environment.getProperty("spring.datasource.maxWait")));
        druidDataSource.setMinIdle(Integer.parseInt(environment.getProperty("spring.datasource.minIdle")));
        druidDataSource.setTimeBetweenEvictionRunsMillis(Long.parseLong(environment.getProperty("spring.datasource.timeBetweenEvictionRunsMillis")));
        druidDataSource.setMinEvictableIdleTimeMillis(Long.parseLong(environment.getProperty("spring.datasource.minEvictableIdleTimeMillis")));
        druidDataSource.setValidationQuery(environment.getProperty("spring.datasource.validationQuery"));
        druidDataSource.setTestWhileIdle(Boolean.parseBoolean(environment.getProperty("spring.datasource.testWhileIdle")));
        druidDataSource.setTestOnBorrow(Boolean.parseBoolean(environment.getProperty("spring.datasource.testOnBorrow")));
        druidDataSource.setTestOnReturn(Boolean.parseBoolean(environment.getProperty("spring.datasource.testOnReturn")));
        druidDataSource.setPoolPreparedStatements(Boolean.parseBoolean(environment.getProperty("spring.datasource.poolPreparedStatements")));
        druidDataSource.setMaxOpenPreparedStatements(Integer.parseInt(environment.getProperty("spring.datasource.maxOpenPreparedStatements")));
        return druidDataSource;
    }

    /**
     * 获取SqlSessionFactory
     * @param druidDataSource
     * @return
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean(DataSource druidDataSource) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(druidDataSource);
        LogFactory.useLog4JLogging();
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String xmlPath = environment.getProperty("mybatis.mapperLocations");
        try {
            bean.setMapperLocations(resolver.getResources(xmlPath));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param sqlSessionFactory
     * @return
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     * 增加事务
     * @param druidDataSource
     * @return
     */
    @Bean
    public DataSourceTransactionManager transactionManager(DataSource druidDataSource) {
        return new DataSourceTransactionManager(druidDataSource);
    }
}
