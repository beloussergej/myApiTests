package collectionsEducation;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class TestDataBuilder {

    public static List<String> getCountriesNamesList() {
        return asList("United States of America", "United Kingdom", "United Arab Emirates", "Mexico", "Spain",
                      "Germany", "Italy", "Canada", "French");
    }

    public static List<CountryDTO> getCountriesList() {
        List<CountryDTO> countriesList = new ArrayList<>();
        countriesList.add(new CountryDTO().setName("United States of America").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Kingdom").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Arab Emirates").setLanguage("ARA"));
        countriesList.add(new CountryDTO().setName("Mexico").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Spain").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Germany").setLanguage("GER"));
        countriesList.add(new CountryDTO().setName("Italy").setLanguage("ITA"));
        countriesList.add(new CountryDTO().setName("Canada").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("French").setLanguage("FRA"));
        return countriesList;
    }

}
