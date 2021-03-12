package com.io.t11.exchangeconnectivity;

import com.io.t11.exchangeconnectivity.index.IndexRoute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ExchangeconnectivityApplication {

    IndexRoute indexRoute;
	public static void main(String[] args) {
		SpringApplication.run(ExchangeconnectivityApplication.class, args);
	}

	@GetMapping
    public String index () {
	    return indexRoute.toString();
    }

}
