package xyz.realm.coronatracker.dao;

import org.springframework.stereotype.Repository;
import xyz.realm.coronatracker.model.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("memory-dao")
public class MemoryCountryDataAccessService implements CountryDao {

    private static List<Country> DB = new ArrayList<>();

    @Override
    public int insertCountry(Country country) {
        DB.add(new Country(country.getCountry()));
        return 0;
    }

    @Override
    public List<Country> selectAllCountries() {
        return null;
    }

    @Override
    public Country selectCountryByName(String name) {
        return null;
    }
}
