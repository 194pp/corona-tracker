package xyz.realm.coronatracker.model;

import java.util.Optional;
import java.util.UUID;

public class Country {
    private final String country;
    private Optional<String> countryCode;
//    private final String continent;
//    private final int population;
//    private final String source;

    public Country(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
