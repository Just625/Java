package com.codegym.demo.formatter;


import com.codegym.demo.model.Country;
import com.codegym.demo.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
public class CountryFormatter implements Formatter<Country> {
    private ICountryService countryService;
    @Autowired
    public CountryFormatter(ICountryService countryService){
        this.countryService = countryService;
    }

    @Override
    public Country parse(String text, Locale locale) throws ParseException {
        Optional<Country> countryOptional =  countryService.findById(Long.parseLong(text));
        return countryOptional.orElse(null);
    }

    @Override
    public String print(Country object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
