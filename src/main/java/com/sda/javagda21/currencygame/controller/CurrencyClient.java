package com.sda.javagda21.currencygame.controller;

import com.sda.javagda21.currencygame.model.CurrencyModel;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CurrencyClient {

    @EventListener(ApplicationReadyEvent.class)
    public void getCurrencyRates () {

        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest?base=PLN",
                CurrencyModel.class);

        System.out.println(forObject);


    }
}
