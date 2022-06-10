package collectionsEducation;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class CountryWorker {

    public static void main(String[] args) {
        List<String> names = TestDataBuilder.getCountriesNamesList();
        List<CountryDTO> allCountries = TestDataBuilder.getCountriesList();
        List<CountryDTO> allCountriesWithDuplicate = TestDataBuilder.getCountriesListWithDuplicate();
//        тут будеш визивать потрібний метот
        System.out.print("LIST COUNTRY :");
        for (String test : names) {
            System.out.print(test + " ,");
        }
        System.out.println('\n');
        System.out.println("Задача1 :" + getListOfNamesEquals(names, "United Arab Emirates"));
        System.out.println();
        System.out.println("Задача2 :" + getNameEquals(names, "united"));
        System.out.println();
        System.out.println("Задача3 :" + getSortListOfNames(names, false));
        System.out.println();
        System.out.println("Задача4 :" + getListOfCountriesNameEquals(allCountries, "iTaLy"));
        System.out.println();
        System.out.println("Задача5 :" + getListOfCountriesNameContains(allCountries, "uniTed"));
        System.out.println();
        System.out.println("Задача6 :" + getListOfCountriesByName(allCountries, "united", false));
        System.out.println();
        System.out.println("Задача7 :" + getListOfCountriesByLanguage(allCountries, "fra"));
        System.out.println();
        System.out.println("Задача8 :" + getListOfCountriesByLanguageMap(allCountries, "eng"));
        System.out.println();
        System.out.println("Задача9 :" + getListOfCountriesByLanguageMap(allCountries));
    }

    private static List<String> getListOfNamesEquals(List<String> names, String name) {
        List<String> filteredCountries = new ArrayList<>();

        for (String country : names) {

            if (country.equalsIgnoreCase(name)) {
                filteredCountries.add(country);
            }
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 1: знайди всі імена, які містить введене значення, наприклад united.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United

        return filteredCountries;
    }

    private static String getNameEquals(List<String> names, String name) {
        String filteredCountry = "";
        for (String country : names) {

            if (country.toUpperCase().contains(name.toUpperCase())) {
                filteredCountry = country;
            }
            break;
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 2: знайди перше ім'я, які містить введене значення, наприклад united.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United
        return filteredCountry;
    }

    private static List<String> getSortListOfNames(List<String> names, boolean isAscendingOrder) {

        if (isAscendingOrder) {
            Collections.sort(names);//приходить тру
        } else {
            Collections.sort(names, Collections.reverseOrder());//приходить фолс
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 3: відсортіруй імена в алфавітному порядку,
//    в залежності від значення isAscendingOrder сортуй або від А-Я, або Я-А
//    Сортування теж Case insensitive
        return names;
    }

    private static List<CountryDTO> getListOfCountriesNameEquals(List<CountryDTO> allCountries, String name) {
        List<CountryDTO> filteredCountries = new ArrayList<>();

        for (CountryDTO country : allCountries) {

            if (country.getName().equalsIgnoreCase(name)) {
                filteredCountries.add(country);
            }
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 4: знайди всі країни в яких назва(name) дорівнює введеному значенню, наприклад italy.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для italy, ITALY і Italy
        return filteredCountries;
    }

    private static List<CountryDTO> getListOfCountriesNameContains(List<CountryDTO> allCountries, String name) {
        List<CountryDTO> filteredCountries = new ArrayList<>();

        for (CountryDTO country : allCountries) {

            if (country.getName().toUpperCase().contains(name.toUpperCase())) {
                filteredCountries.add(country);
            }
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 5: знайди всі країни в яких назва(name) містить введене значення, наприклад united.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United
        return filteredCountries;
    }

    private static List<CountryDTO> getListOfCountriesByName(List<CountryDTO> allCountries, String name,
            boolean isFullMatch) {
        List<CountryDTO> filteredCountries = new ArrayList<>();

        return isFullMatch ? getListOfCountriesNameEquals(allCountries, name) :
                getListOfCountriesNameContains(allCountries, name);
        //    Замість мого коментаря повинна бути реалізація
//    Задача 6: знайди всі країни по назві назва(name).
//    Користувач може вказувати, чи назва повинна дорівнювати знайденому слову, чи містити слово.
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для united, UNITED і United

    }

    private static List<CountryDTO> getListOfCountriesByLanguage(List<CountryDTO> allCountries, String language) {
        List<CountryDTO> filteredCountries = new ArrayList<>();

        for (CountryDTO country : allCountries) {

            if (country.getLanguage().equalsIgnoreCase(language)) {
                filteredCountries.add(country);
            }
        }
//    Замість мого коментаря повинна бути реалізація
//    Задача 7: знайди всі країни по введеній мові(language).
//    Пошук повинен бути case insensitive - тобто буде працювати однаково для eng, ENG
        return filteredCountries;
    }

    private static Map<String, List<CountryDTO>> getListOfCountriesByLanguageMap(List<CountryDTO> allCountries,
            String language) {
        Map<String, List<CountryDTO>> filteredCountriesMap = new HashMap<>();
        List<String> languages = Arrays.asList("ENG", "SPA", "FRA");

        for (String lang : languages) {
            filteredCountriesMap.put(lang, getListOfCountriesByLanguage(allCountries, lang));
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 8: створи мапу, ключ в якої буда мова, а значеня - це лист країн, в якої мова дорівнює мові з ключа.
//     Використовуй метод getListOfCountriesByLanguage для кожного елементу в листі languages
        return filteredCountriesMap;
    }

    private static List<CountryDTO> getListOfCountriesByLanguageMap(List<CountryDTO> allCountries) {
        Map<String, String> languages = new HashMap<>();
        languages.put("ENG", "English");
        languages.put("SPA", "Spain");
        languages.put("FRA", "French");
        languages.put("ARA", "Arabic");
        languages.put("ITA", "Italian");
        languages.put("GER", "Germany");

        for (CountryDTO country : allCountries) {
            country.setLanguage(languages.get(country.getLanguage()));
        }
        //    Замість мого коментаря повинна бути реалізація
//    Задача 9: пройдись по всьому листу і заміни коротку назву мови на довгу("ENG" на "English")
//    Для нових назв вікористовуй мапу languages
//    верни лист уже з новими значеннями для мови
        return allCountries;
    }

    private static boolean isListEmpty(List<Object> list) {
////    Задача 10: для цієї задачі використовуй будь який лист
//      Твоя задача в методі чи лист пустий чи ні. Він повинен працювати якщо ти передаси:
//      не пустий лист, пустий лист, null замість ліста
        return false;
    }

    private static Integer getIndexOfName(List<String> names, String name) {
////    Задача 11: для цієї задачі використовуй names
//      Твоя задача вернути індекс імени по введеному тексту, тобто якщо користувач введе імя Mexico, то ти вертаєш 3
//      У випадку, якщо імя не знайдено, тоді викінь ексепшн з тестом, що імя не знайдено
        return 0;
    }

    private static Integer getIndexOfCountry(List<CountryDTO> allCountries, String name) {
////    Задача 12: для цієї задачі використовуй allCountries
//      Твоя задача вернути індекс країни по її імені, тобто якщо користувач введе імя Germany, то ти вертаєш 5
        return 0;
    }

    private static List<String> getListWithReplacedName(List<String> names, String name) {
////    Задача 13: для цієї задачі використовуй names
//      Твоя задача замінити ім,я в листі, якщо воно написано з маленької букви
        return names;
    }

    private static List<String> getListWithReplacedName(List<String> names) {
////    Задача 14: для цієї задачі використовуй names
//      Твоя задача замінити всі імена в листі, які написані з маленької букви
        return names;
    }

    private static List<String> getUpdatedList(List<String> names, String name) {
////    Задача 15: для цієї задачі використовуй names
//      В цьому методі треба добавити нове ім,я на початок листа
        return names;
    }

    private static void printAllNames(List<String> names) {
////    Задача 16: для цієї задачі використовуй names
//      Надрукуй всі елементи з нового рядка, текст повинен бути: "Name on position 1 is United States of America"
//      Починай рахунок з 1, для форматування стрінги використай метод StringUtil.format() - погугли синтаксис
    }

    private static List<CountryDTO> getListOfCountriesWithoutDuplicate(List<CountryDTO> allCountries) {
//    Задача 17: для цієї задачі використовуй лист allCountriesWithDuplicate
//    Твоя задача вернути лист без дублікатів. Одного єдиного вирішення задачі немає, можеш написать кілька, які прийдуть в голову.
//    Значення для ретурна заміни, я просто написала, щоб не ругався компілятор(це відноситься до всіх задач)
        return new ArrayList<>();
    }

    private static String getCountriesNamesString(List<CountryDTO> allCountries) {
////    Задача 18: для цієї задачі використовуй лист allCountriesWithDuplicate
////    Твоя задача вернути стрінгу, в якій містяться тільки назви всіх країн, без дублікатів, написані через кому:
//       Italy,French,United Kingdom і тд
//      В цій задачі використовуються і методи колекцій і методи стрінги
        return EMPTY;
    }

    private static List<CountryDTO> getListOfCountriesWithDeleted(List<CountryDTO> allCountries) {
////    Задача 19: для цієї задачі використовуй лист allCountries
//      Видали з листа всі країни, у яких значення поля toDelete=true, верни лист без ціх країн
        return new ArrayList<>();
    }

    private static List<CountryDTO> getListOfTwoLists(List<CountryDTO> firstCountriesList,
            List<CountryDTO> secondCountriesList) {
////    Задача 20: для цієї задачі використовуй лист allCountries і allCountriesWithDuplicate
//      Твоя задача створити один лист з двох листів, він повинен містити тільки унікальні значення(без дублікатів)
//        Верни цей лист
        return new ArrayList<>();
    }

}
