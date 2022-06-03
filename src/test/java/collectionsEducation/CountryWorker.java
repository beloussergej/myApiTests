package collectionsEducation;

import java.util.*;

public class CountryWorker {

    public static void main(String[] args) {
        List<String> names = TestDataBuilder.getCountriesNamesList();
        List<CountryDTO> allCountries = TestDataBuilder.getCountriesList();
//        тут будеш визивать потрібний метот
        System.out.println();
    }

    private List<String> getListOfNamesEquals(List<String> names, String name) {
        List<String> filteredCountries = new ArrayList<>();
//    Замість мого коментаря повинна бути реалізація
//    Задача 1: знайди всі імена, які містить введене значення, наприклад united.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United
        return filteredCountries;
    }

    private String getNameEquals(List<String> names, String name) {
        String filteredCountry = "";
//    Замість мого коментаря повинна бути реалізація
//    Задача 2: знайди перше ім'я, які містить введене значення, наприклад united.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United
        return filteredCountry;
    }

    private List<String> getSortListOfNames(List<String> names, boolean isAscendingOrder) {
        List<String> filteredCountries = new ArrayList<>();
//    Замість мого коментаря повинна бути реалізація
//    Задача 3: відсортіруй імена в алфавітному порядку,
//    в залежності від значення isAscendingOrder сортуй або від А-Я, або Я-А
//    Сортування теж Case insensitive
        return filteredCountries;
    }

    private List<CountryDTO> getListOfCountriesNameEquals(List<CountryDTO> allCountries, String name) {
        List<CountryDTO> filteredCountries = new ArrayList<>();
//    Замість мого коментаря повинна бути реалізація
//    Задача 4: знайди всі країни в яких назва(name) дорівнює введеному значенню, наприклад italy.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для italy, ITALY і Italy
        return filteredCountries;
    }

    private List<CountryDTO> getListOfCountriesNameContains(List<CountryDTO> allCountries, String name) {
        List<CountryDTO> filteredCountries = new ArrayList<>();
//    Замість мого коментаря повинна бути реалізація
//    Задача 5: знайди всі країни в яких назва(name) містить введене значення, наприклад united.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United
        return filteredCountries;
    }

    private List<CountryDTO> getListOfCountriesByName(List<CountryDTO> allCountries, String name, boolean isFullMatch) {
        List<CountryDTO> filteredCountries = new ArrayList<>();
//    Замість мого коментаря повинна бути реалізація
//    Задача 6: знайди всі країни по назві назва(name).
//    Користувач може вказувати, чи назва повинна дорівнювати знайденому слову, чи містити слово.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United
        return filteredCountries;
    }

    private List<CountryDTO> getListOfCountriesByLanguage(List<CountryDTO> allCountries, String language) {
        List<CountryDTO> filteredCountries = new ArrayList<>();
//    Замість мого коментаря повинна бути реалізація
//    Задача 7: знайди всі країни по введеній мові(language).
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для eng, ENG
        return filteredCountries;
    }

    private Map<String, List<CountryDTO>> getListOfCountriesByLanguageMap(List<CountryDTO> allCountries,
            String language) {
        Map<String, List<CountryDTO>> filteredCountriesMap = new HashMap<>();
        List<String> languages = Arrays.asList("ENG", "SPA", "FRA");
//    Замість мого коментаря повинна бути реалізація
//    Задача 8: створи мапу, ключ в якої буда мова, а значеня - це лист країн, в якої мова дорівнює мові з ключа.
//     Використовуй метод getListOfCountriesByLanguage для кожного елементу в листі languages
        return filteredCountriesMap;
    }

    private List<CountryDTO> getListOfCountriesByLanguageMap(List<CountryDTO> allCountries) {
        Map<String, String> languages = new HashMap<>();
        languages.put("ENG", "English");
        languages.put("SPA", "Spain");
        languages.put("FRA", "French");
        languages.put("ARA", "Arabic");
        languages.put("ITA", "Italian");
//    Замість мого коментаря повинна бути реалізація
//    Задача 9: пройдись по всьому листу і заміни коротку назву мови на довгу("ENG" на "English")
//    Для нових назв вікористовуй мапу languages
//    верни лист уже з новими значеннями для мови
        return allCountries;
    }

}
