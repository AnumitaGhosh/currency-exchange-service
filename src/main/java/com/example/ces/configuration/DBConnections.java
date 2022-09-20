//package com.example.ces.configuration;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//@Configuration
//@ConfigurationProperties("spring.datasource")
//@SuppressWarnings("unused")
//public class DBConnections {
//	
//	
//	private String driverclassname;
//	private String url;
//	private String username;
//	private String password;
//	
//	@Profile("dev")
//	@Bean	
//	public DataSource devDatabaseConnection()
//	{		
//		System.out.println("From Dev");
//		 return DataSourceBuilder.create().build();	
//	}
//
//}
