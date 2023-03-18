package com.dmdev.week7.homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

/**
 * Даны два файла в формате CSV.
 * <p>
 * CSV (Comma-Separated Values) файл - это обычный текстовый файл, где через запятую (может использоваться и любой другой символ) перечислены значения. Также может быть в первой строчке таких файлов заголовок с названием колонок.
 * <p>
 * Формат первого файла items-price.csv:
 * <p>
 * ID,PRICE
 * 1,9.98
 * 2,25.05
 * 3,16.45
 * <p>
 * Формат второго файла items-name.csv:
 * <p>
 * ID,NAME,DESCRIPTION
 * 1,Шарф,Теплый зимний шарф красного цвета
 * 2,Шапка,Вязаная зеленая шапка
 * 3,Ботинки,Осенние ботинки на толстой подошве
 * <p>
 * Задача:
 * <p>
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.
 * <p>
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */

public class Task1 {

    public static void main(String[] args) throws IOException {
        Path pathPrice = Path.of("resources", "items-price.csv");
        Path pathName = Path.of("resources", "items-name.csv");
        File pathResult = Path.of("resources", "result.csv").toFile();
        File pathError = Path.of("resources", "errors.csv").toFile();

        List<ItemPrice> itemPriceList = Files.readAllLines(pathPrice).stream()
                .filter(Objects::nonNull)
                .map(ItemPrice::new)
                .toList();
        List<ItemName> itemNameList = Files.readAllLines(pathName).stream()
                .filter(Objects::nonNull)
                .map(ItemName::new)
                .toList();

        Map<String, List<String>> mapIdAndPrice = itemPriceList.stream()
                .collect(groupingBy(ItemPrice::getId, mapping(ItemPrice::getPrice, Collectors.toList())));
        Map<String, List<String>> mapIdAndName = itemNameList.stream()
                .collect(groupingBy(ItemName::getId, mapping(ItemName::getName, Collectors.toList())));

        Map<String, List<String>> mapResult = new HashMap<>();

        getMapResultForIdNameAndPeice(mapIdAndPrice, mapIdAndName, mapResult);

        writeOutputStreamResult(pathResult, mapResult);

        Set<String> setNameId = new HashSet<>(mapIdAndName.keySet());
        Set<String> setPriceId = new HashSet<>(mapIdAndPrice.keySet());
        List<String> differenceListId = findDifferenceIds(setNameId, setPriceId);

        writeOutputStreamDfferenceIds(pathError, differenceListId);
        printResultInfo(itemPriceList, itemNameList, mapResult, differenceListId);
    }

    private static void printResultInfo(List<ItemPrice> itemPriceList, List<ItemName> itemNameList, Map<String, List<String>> mapResult, List<String> differenceListId) {
        for (ItemName itemName : itemNameList) {
            System.out.println(itemName);
        }

        System.out.println();

        for (ItemPrice itemPrice : itemPriceList) {
            System.out.println(itemPrice);
        }

        System.out.println();

        for (Map.Entry<String, List<String>> listEntryItem : mapResult.entrySet()) {
            System.out.println(listEntryItem);
        }

        System.out.println("Difference id's: " + differenceListId);
    }

    private static void writeOutputStreamDfferenceIds(File pathError, List<String> differenceListId) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(pathError)) {
            String value = "Different id's:";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());

            for (String difference : differenceListId) {
                outputStream.write(difference.getBytes());
                outputStream.write(System.lineSeparator().getBytes());
            }
        }
    }

    private static void writeOutputStreamResult(File pathResult, Map<String, List<String>> mapResult) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(pathResult)) {
            for (Map.Entry<String, List<String>> listEntryItem : mapResult.entrySet()) {
                outputStream.write(listEntryItem.toString().getBytes());
                outputStream.write(System.lineSeparator().getBytes());
            }
        }
    }

    private static List<String> findDifferenceIds(Set<String> setNameId, Set<String> setPriceId) {
        List<String> differenceListId = new ArrayList<>();
        if (setNameId.size() > setPriceId.size()) {
            differenceListId = setNameId.stream()
                    .filter(id -> !setPriceId.contains(id))
                    .toList();

        } else if (setPriceId.size() > setNameId.size()) {
            differenceListId = setPriceId.stream()
                    .filter(id -> !setNameId.contains(id))
                    .toList();
        }
        return differenceListId;
    }

    private static void getMapResultForIdNameAndPeice(Map<String, List<String>> mapIdAndPrice, Map<String, List<String>> mapIdAndName, Map<String, List<String>> mapResult) {
        List<String> resultValue;
        for (String keyIdName : mapIdAndName.keySet()) {
            for (String keyIdPrice : mapIdAndPrice.keySet()) {
                if (Objects.equals(keyIdName, keyIdPrice)) {
                    List<String> listName = getList(mapIdAndName, keyIdName);
                    List<String> listPrice = getList(mapIdAndPrice, keyIdName);

                    resultValue = Stream.concat(listName.stream(), listPrice.stream()).collect(Collectors.toList());

                    mapResult.put(keyIdName, resultValue);
                }
            }
        }
    }

    private static List<String> getList(Map<String, List<String>> mapIdAndName, String s) {
        return mapIdAndName.entrySet().stream()
                .filter(idAndName -> Objects.equals(idAndName.getKey(), s))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .toList();
    }
}