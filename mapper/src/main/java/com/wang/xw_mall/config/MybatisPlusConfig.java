package com.wang.xw_mall.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/10/12
 */

@Configuration
public class MybatisPlusConfig {

    @Bean(name = "globalConfig")
    @Primary
    public GlobalConfig globalConfig() {
        GlobalConfig globalConfig = new GlobalConfig();
        return globalConfig;
    }

    @Bean("sqlSessionFactory")
    @Primary
    public SqlSessionFactory dbSqlSessionFactory(@Qualifier("dataSource") DataSource dataSource, GlobalConfig globalConfig) throws Exception {
        // MybatisSqlSessionFactoryBean
        MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setGlobalConfig(globalConfig());

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        // 需要在这里指定xml文件的位置，不然自定义的sql会报Invalid bound statement异常
        factoryBean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        factoryBean.setTypeAliasesPackage("com.wang.xw_mall.pojo");


        // 导入mybatis配置
        MybatisConfiguration mybatisConfiguration = new MybatisConfiguration();
        // // 配置打印sql语句
        mybatisConfiguration.setLogImpl(StdOutImpl.class);
        factoryBean.setConfiguration(mybatisConfiguration);

        return factoryBean.getObject();
    }
}