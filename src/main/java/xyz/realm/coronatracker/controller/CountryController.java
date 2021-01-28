package xyz.realm.coronatracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.realm.coronatracker.model.Country;
import xyz.realm.coronatracker.service.CountryService;

@RequestMapping("api/country")
@RestController
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public Country getCountry(String name) {
        return countryService.getCountryByName(name);
    }
}
