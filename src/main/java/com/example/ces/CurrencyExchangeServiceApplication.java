package com.example.ces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.ces.dao.CurrencyExchangeRepository;
import com.example.ces.entity.CurrencyExchange;



@SpringBootApplication
@EnableConfigurationProperties(CurrencyExchange.class)
public class CurrencyExchangeServiceApplication implements CommandLineRunner {
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private CurrencyExchange ce;

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		ce.setFromCurrency("Pound");
		ce.setToCurrency("INR");
		ce.setConversionMultiples(70);
		repository.save(ce);
		System.out.println("saved:"+ce.getType());
	}
	

}
