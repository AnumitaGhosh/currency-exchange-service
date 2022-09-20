package com.example.ces.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ces.entity.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepository extends CrudRepository<CurrencyExchange,Integer> {

}
