package education;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class TestDataBuilder {

    public static List<String> getCountriesNamesList() {
        return asList("United States of America", "united kingdom", "United Arab Emirates", "Mexico", "Spain",
                      "germany", "Italy", "Canada", "french");

    }

    public static List<CountryDTO> getCountriesList() {
        List<CountryDTO> countriesList = new ArrayList<>();
        countriesList.add(new CountryDTO().setName("United States of America").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Kingdom").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Arab Emirates").setLanguage("ARA"));
        countriesList.add(new CountryDTO().setName("Mexico").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Spain").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Germany").setLanguage("GER"));
        countriesList.add(new CountryDTO().setName("Germany").setLanguage("GER").setToDelete(true));
        countriesList.add(new CountryDTO().setName("Italy").setLanguage("ITA"));
        countriesList.add(new CountryDTO().setName("Italy").setLanguage("ITA").setToDelete(true));
        countriesList.add(new CountryDTO().setName("Canada").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("Canada").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("Canada").setLanguage("ENG").setToDelete(true));
        countriesList.add(new CountryDTO().setName("French").setLanguage("FRA"));
        return countriesList;
    }

    public static List<CountryDTO> getCountriesListWithDuplicate() {
        List<CountryDTO> countriesList = new ArrayList<>();
        countriesList.add(new CountryDTO().setName("United States of America").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Kingdom").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Kingdom").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("United Arab Emirates").setLanguage("ARA"));
        countriesList.add(new CountryDTO().setName("Mexico").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Mexico").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Spain").setLanguage("SPA"));
        countriesList.add(new CountryDTO().setName("Germany").setLanguage("GER"));
        countriesList.add(new CountryDTO().setName("Italy").setLanguage("ITA"));
        countriesList.add(new CountryDTO().setName("Canada").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("Canada").setLanguage("ENG"));
        countriesList.add(new CountryDTO().setName("French").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("French Polynesia").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("French").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("French").setLanguage("FRA"));
        countriesList.add(new CountryDTO().setName("Czech Republic"));
        countriesList.add(new CountryDTO().setName("Bulgaria"));
        countriesList.add(new CountryDTO().setName("Netherlands"));
        countriesList.add(new CountryDTO().setName("Moldova"));
        countriesList.add(new CountryDTO().setName("Ukraine"));
        return countriesList;
    }

}
