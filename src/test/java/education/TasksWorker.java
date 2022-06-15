package education;

import java.util.*;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class TasksWorker {

    public static void main(String[] args) throws Exception {
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
        System.out.println();
        System.out.println("Задача 10 :" + isListEmpty(allCountriesWithDuplicate));
        System.out.println();
        System.out.println("Задача 11 :" + getIndexOfName(names, "Mexico"));
        System.out.println();
        System.out.println("Задача 12 :" + getIndexOfCountry(allCountries, "Spain"));
        System.out.println();
        System.out.println("Задача 13 :" + getListWithReplacedName(names, "united kingdom"));
        System.out.println();
        System.out.println("Задача 14 :" + getListWithReplacedName(names));
        System.out.println();
        System.out.println("Задача 15 :" + getUpdatedList(names, "Ukraine"));
        System.out.println();

        printAllNames(names);//Задача 16

        System.out.println();
        System.out.println("Задача 17 :" + getListOfCountriesWithoutDuplicate(allCountriesWithDuplicate));
        System.out.println();
        System.out.println("Задача 18 :" + getCountriesNamesString(allCountriesWithDuplicate));
        System.out.println();
        System.out.println("Задача 19 :" + getListOfCountriesWithDeleted(allCountries));
        System.out.println();
        System.out.println("Задача 20 :" + getListOfTwoLists(allCountries, allCountriesWithDuplicate));
        System.out.println();
        System.out.println("Задача 21 :");printMaxAndMin();
        System.out.println();
        System.out.println("Задача 22 :" + isTextPalindrome("12344321"));
        System.out.println();
        System.out.println("Задача 23 :кількість слів у тексті = " + getHowManyWordsInText("А роза упала на лапа Азора"));
        System.out.println();
        System.out.println("Задача 24 :" + getHowManyTimesWordInText("футбол мяф футбол судья футбол игра поле","футбол"));
        System.out.println();
        System.out.println("Задача 25 :" + getFormattedDouble(2.7854));
        System.out.println();
        System.out.println("Задача 26 :" + Arrays.toString(sortIntArray(new int[]{43,6,12,87,0,34,3,1,1,1,564,456,4,3,6,5,14,64})));
        System.out.println();
        System.out.print("Задача 27 :");printStringReverse("Добрий вечір ми із України");
        System.out.println();
        System.out.print("Задача 28 :");printFibonacci(10);
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

    private static boolean isListEmpty(List<CountryDTO> allCountriesWithDuplicate) throws Exception {

        if (allCountriesWithDuplicate == null) {
            throw new RuntimeException("List is null");
        } else if (allCountriesWithDuplicate.isEmpty()) {
            System.out.println("list is empty");
            return true;
        } else {
            System.out.println("list is not empty");
            return false;
        }
    }
////    Задача 10: для цієї задачі використовуй будь який лист
//      Твоя задача в методі чи лист пустий чи ні. Він повинен працювати якщо ти передаси:
//      не пустий лист, пустий лист, null замість ліста
    private static Integer getIndexOfName(List<String> names, String name) throws Exception {
        int index = names.indexOf(name);

        if (index < 0) {
            throw new IllegalArgumentException("name is not found");
        } else {
            return index;
        }
    }
////    Задача 11: для цієї задачі використовуй names
//      Твоя задача вернути індекс імени по введеному тексту, тобто якщо користувач введе імя Mexico, то ти вертаєш 3
//      У випадку, якщо імя не знайдено, тоді викінь ексепшн з тестом, що імя не знайдено
    private static Integer getIndexOfCountry(List<CountryDTO> allCountries, String name) throws Exception {

        for (CountryDTO country : allCountries) {
            if (country.getName().equals(name)) {
                return allCountries.indexOf(country);
            }
        }
        throw new IllegalArgumentException("name is not found");
    }
////    Задача 12: для цієї задачі використовуй allCountries
//      Твоя задача вернути індекс країни по її імені, тобто якщо користувач введе імя Germany, то ти вертаєш 5
    private static List<String> getListWithReplacedName(List<String> names, String name) {

        int index = names.indexOf(name.toLowerCase());

        if (index < 0) {
            return names;
        }
        names.set(index, names.get(index).toUpperCase());
        return names;
    }
////    Задача 13: для цієї задачі використовуй names
//      Твоя задача замінити ім,я в листі, якщо воно написано з маленької букви
    private static List<String> getListWithReplacedName(List<String> names) {

        for (String country : names) {
            getListWithReplacedName(names, country);
        }
        return names;
    }
////    Задача 14: для цієї задачі використовуй names
//      Твоя задача замінити всі імена в листі, які написані з маленької букви
    private static List<String> getUpdatedList(List<String> names, String name) {
        List<String> country = new ArrayList<>(names);

        int index = names.indexOf(name);

        if (index < 0) {
            System.out.println(country.size());
            country.add(0, name);
            System.out.println(country.size());
        }
        return country;
    }
////    Задача 15: для цієї задачі використовуй names
//      В цьому методі треба добавити нове ім,я на початок листа
    private static void printAllNames(List<String> names) {
        int index = 1;

        for (int i = 0; i < names.size(); i++) {
            System.out.println(String.format("Name on position %s is %s", index, names.get(i)));
            index++;
        }
    }
////    Задача 16: для цієї задачі використовуй names
//      Надрукуй всі елементи з нового рядка, текст повинен бути: "Name on position 1 is United States of America"
//      Починай рахунок з 1, для форматування стрінги використай метод StringUtil.format() - погугли синтаксис
    private static List<CountryDTO> getListOfCountriesWithoutDuplicate(List<CountryDTO> allCountriesWithDuplicate) {
        Set<CountryDTO> set = new HashSet<>(allCountriesWithDuplicate);

        List<CountryDTO> list = new ArrayList<>(set);

        return list;
    }
//    Задача 17: для цієї задачі використовуй лист allCountriesWithDuplicate
//    Твоя задача вернути лист без дублікатів. Одного єдиного вирішення задачі немає, можеш написать кілька, які прийдуть в голову.
//    Значення для ретурна заміни, я просто написала, щоб не ругався компілятор(це відноситься до всіх задач)
    private static String getCountriesNamesString(List<CountryDTO> allCountriesWithDuplicate) {
        List<String> namesList = new ArrayList<>();

        for (CountryDTO country : getListOfCountriesWithoutDuplicate(allCountriesWithDuplicate)) {
            namesList.add(country.getName());
        }
        String text = String.join(";", namesList);
        return text;
    }
////    Задача 18: для цієї задачі використовуй лист allCountriesWithDuplicate
////    Твоя задача вернути стрінгу, в якій містяться тільки назви всіх країн, без дублікатів, написані через кому:
//       Italy,French,United Kingdom і тд
//      В цій задачі використовуються і методи колекцій і методи стрінги
    private static List<CountryDTO> getListOfCountriesWithDeleted(List<CountryDTO> allCountries) {
        List<CountryDTO> list = new ArrayList<>(allCountries);

        for (CountryDTO country : allCountries) {
            if (country.isToDelete()) {
                list.remove(country);
            }
        }
        return list;
    }
////    Задача 19: для цієї задачі використовуй лист allCountries
//      Видали з листа всі країни, у яких значення поля toDelete=true, верни лист без ціх країн
    private static List<CountryDTO> getListOfTwoLists(List<CountryDTO> allCountries,
                                                      List<CountryDTO> allCountriesWithDuplicate) {
        /*Long l1 = System.nanoTime();
        allCountries.addAll(allCountriesWithDuplicate);
        Set<CountryDTO> set = new HashSet<>(allCountries); ////перший спосіб

        List<CountryDTO> result = new ArrayList<>(set);

        Long l2 = System.nanoTime();
        System.out.println(l2 - l1);

        return result;
    }
}*/
        Long l3 = System.nanoTime();////другий спосіб - відпрацьовуе швидше

        allCountries.addAll(allCountriesWithDuplicate);

        System.out.println(allCountries.size());
        Long l4 = System.nanoTime();
        System.out.println(l4 - l3);

        return getListOfCountriesWithoutDuplicate(allCountries);
////    Задача 20: для цієї задачі використовуй лист allCountries і allCountriesWithDuplicate
//      Твоя задача створити один лист з двох листів, він повинен містити тільки унікальні значення(без дублікатів)
//        Верни цей лист
    }
    private static void printMaxAndMin() {
        int arrayLength = 50;
        double[] arrayWithDouble = new double[arrayLength];
        for (int i = 0; i < arrayWithDouble.length; i++) {
            arrayWithDouble[i] = Math.random();
        }
        double minArray = arrayWithDouble[0];
        double maxArray = arrayWithDouble[0];
        for (int i = 1; i < arrayWithDouble.length; i++) {
            if (arrayWithDouble[i] < minArray) {
                minArray = arrayWithDouble[i];
            }else if(arrayWithDouble[i] > maxArray){
                maxArray = arrayWithDouble[i];
            }
        }
        System.out.println("MIN arrayWithDouble : " + minArray );
        System.out.println("MAX arrayWithDouble : " + maxArray );
//      Задача 21: знайди і надрукуй мінімальне і максимальне число в масиві. Для пошуку мін і макс колекції не використовуй
    }
    private static boolean isTextPalindrome(String text) {
        String myString = text.replaceAll(" ", "");
        String[] line = myString.toLowerCase().split("");

        for (int i = 0; i < line.length; i++) {
            for (int j = line.length - 1; j >= 0; j--) {
                if (line[i].equals(line[j])) {
                    i++;
                    continue;
                }
                System.out.println("given string is not palindrome");
                return false;
            }
        }
        System.out.println("given string is palindrome");
        return true;
    }
//      Задача 22: провірь чи текст являється паліндромомом.
//      Колекції використовувати не можна
//       протестуй на таких значенях:
//       Saippuakivikauppias - true
//       А роза упала на лапу Азора - true
//       А роза упала на лапу Азор - false
//       "1234321" - true
//       "12344321" - true
//       "123443212" - false
    private static int getHowManyWordsInText(String text) {
        String[] str = text.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if(!str[i].equals("-")){
                count++;
            }
        }
        return count;
    }
//      Задача 23: верни кількість слів в тексті
//        Протестуй на будь-якому тексті
    private static int getHowManyTimesWordInText(String text, String word) {
        String[] string = text.split(" ");
        int count = 0;

        for (int i = 0; i < string.length; i++) {
            if (string[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
//      Задача 24: верни кількість скільки раз слово повторюється в тексті
//        Протестуй на будь-якому тексті, де буде повторюватись слово
    private static double getFormattedDouble(double value) {

        String result = String.format("%.2f",value);
        String replaceSigns = result.replaceAll(",",".");

        Double parseDouble = Double.parseDouble(replaceSigns);

        return parseDouble;
    }
//      Задача 25: округли double, щоб після коми було 2 значення(арифметично правильно)
//        Протестуй на 0,125455, повинно бути 0,13
//        Протестуй на 2,7854, повинно бути 2,79
//        Протестуй на 3,65438, повинно бути 3,65
    private static int[] sortIntArray(int[] intArray) {

            for (int i = intArray.length - 1; i > 0; i--) {

                for (int j = 0; j < i; j++) {

                    if(intArray[j] > intArray[j + 1]){
                        int tmp = intArray[j];
                        intArray[j] = intArray[j + 1];
                        intArray[j +1] = tmp;

                    }

                }
            }
//      Задача 26: відсортуй масив чисел
//       протестуй на int[] arr = new int[]{43,6,12,87,0,34,3,1,1,1,564,456,4,3,6,5,14,64};
        return intArray;
    }
    private static void printStringReverse(String text) {
        String line = "";
        String[] word = text.split(" ");

        for (int i = word.length - 1; i >= 0; i--) {
            line += word[i] + " ";
        }
        System.out.println(line);
    }
//      Задача 27: надрукуй стрінгу задом наперед
    private static void printFibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + ", ");
        }
//      Задача 28: надрукуй перші 10 чисел Фібоначі
    }

}
