package xyz.realm.coronatracker.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xyz.realm.coronatracker.dao.RawDataDao;

@Service
public class CountryRawDataService {

    private final RawDataDao rawDataDao;

    public CountryRawDataService(@Qualifier("memory-dao") RawDataDao rawDataDao) {
        this.rawDataDao = rawDataDao;
    }

}
