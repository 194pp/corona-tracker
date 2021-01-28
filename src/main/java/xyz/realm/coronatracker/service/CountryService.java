package xyz.realm.coronatracker.service;

import org.springframework.stereotype.Service;
import xyz.realm.coronatracker.dao.CountryDao;
import xyz.realm.coronatracker.model.Country;

import java.util.List;

@Service
public class CountryService {

    private final CountryDao countryDao;

    public CountryService(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    public int addCountry(Country country) {
        return countryDao.insertCountry(country);
    }

    public List<Country> getAllCountries() {
        return countryDao.selectAllCountries();
    }

    public Country getCountryByName(String name) {
        return countryDao.selectCountryByName(name);
    }
}
