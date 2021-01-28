package xyz.realm.coronatracker.dao;

import xyz.realm.coronatracker.model.Country;

import java.util.List;
import java.util.UUID;

public interface CountryDao {

    int insertCountry(Country country);
    List<Country> selectAllCountries();
    Country selectCountryByName(String name);
}
