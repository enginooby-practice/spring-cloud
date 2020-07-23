package com.cpulover.microservices.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cpulover.microservices.entity.CurrencyConversion;

@FeignClient(name = "currency-exchange-microservice")//, url = "localhost:8000") // using Ribbon instead
@RibbonClient(name = "currency-exchange-microservice")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion getExchangeValue(@PathVariable String from, @PathVariable String to);
}
