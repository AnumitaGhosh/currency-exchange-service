package com.example.ces.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;

@Entity
@Table(name="CEM_CURRENCY_EXCHANGE")
@ConfigurationProperties("currency-exchange-service")
public class CurrencyExchange {
	
	@Id
	@GeneratedValue
	private int id;
	private String fromCurrency;
	private String toCurrency;
	private int conversionMultiples;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CurrencyExchange() {}
	
	public CurrencyExchange(int id, String fromCurrency, String toCurrency, int conversionMultiples) {
		super();
		this.id = id;
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
		this.conversionMultiples = conversionMultiples;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public int getConversionMultiples() {
		return conversionMultiples;
	}
	public void setConversionMultiples(int conversionMultiples) {
		this.conversionMultiples = conversionMultiples;
	}
	
	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + fromCurrency + ", to=" + toCurrency + ", conversionMultiples="
				+ conversionMultiples + "]";
	}

}
