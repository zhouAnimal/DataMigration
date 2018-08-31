package org.big;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MultipleDBConfig {
	//外源数据库
	//创建了mysqlDb bean
	//帮助@Bean加载了所有有前缀spring.ds_mysql的属性。
	//创建并初始化了DataSource类，并创建了mysqlDb DataSource对象。
	@Bean(name = "primaryDataSource")
	@Primary
	@Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "spring.ds-wy")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }
	
	
//	第一行以mysqlJdbcTemplate为名创建了一个JdbcTemplate类型的新Bean。
//	第二行将第一行中创建的DataSource类型新参数传入函数，并以mysqlDB为qualifier。
//	第三行用DataSource对象初始化JdbcTemplate实例。
	@Bean(name = "primaryJdbcTemplate")
    public JdbcTemplate WyjdbcTemplate(@Qualifier("primaryDataSource") DataSource primaryDataSource) {
        return new JdbcTemplate(primaryDataSource);
    }
	
	//名录数据库
	@Bean(name = "mlDataSource")
	@Qualifier("mlDataSource")
    @ConfigurationProperties(prefix = "spring.ds-ml")
    public DataSource postgresDataSource() {
        return  DataSourceBuilder.create().build();
    }

	// 名录JdbcTemplate
	@Bean(name = "mlJdbcTemplate")
    public JdbcTemplate MlJdbcTemplate(@Qualifier("mlDataSource") 
                                              DataSource mlDataSource) {
        return new JdbcTemplate(mlDataSource);
    }

}
