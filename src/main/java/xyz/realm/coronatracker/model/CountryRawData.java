package xyz.realm.coronatracker.model;

import java.util.Optional;

public class CountryRawData {
    private final String country;
    private final Optional<String> countryCode;
    private final String continent;
    private final int population;
    private final String indicator;
    private final int weeklyCount;
    private final String yearWeek;
    private final Optional<Double> rate14Day;
    private final int cumulativeCount;
    private final String source;

    public CountryRawData(String country, Optional<String> countryCode,
                          String continent, int population,
                          String indicator, int weeklyCount,
                          String yearWeek, Optional<Double> rate14Day,
                          int cumulativeCount, String source) {
        this.country = country;
        this.countryCode = countryCode;
        this.continent = continent;
        this.population = population;
        this.indicator = indicator;
        this.weeklyCount = weeklyCount;
        this.yearWeek = yearWeek;
        this.rate14Day = rate14Day;
        this.cumulativeCount = cumulativeCount;
        this.source = source;
    }
}
