package com.sda.javagda21.currencygame.controller;

import com.sda.javagda21.currencygame.model.CurrencyModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CurrencyClient {

    public CurrencyModel getCurrencyRates() {

        RestTemplate restTemplate = new RestTemplate();
        CurrencyModel forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest?base=PLN",
                CurrencyModel.class);

        return forObject;

    }
}
