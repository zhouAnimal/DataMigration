package org.big;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
@EnableAutoConfiguration(exclude={  
	      JpaRepositoriesAutoConfiguration.class//禁止springboot自动加载持久化bean
	        })  
@SpringBootApplication
public class DataMigrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataMigrationApplication.class, args);
	}
}
