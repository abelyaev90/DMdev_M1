package com.dmdev.week6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

/**
 * Задание 1
 * <p>
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class Task1 {

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("Ivan", "Ivanov", 3, List.of(4, 5, 3, 5, 5, 5)),
                new Student("Dima", "Semenov", 1, List.of(3, 5, 5, 1, 4, 2)),
                new Student("Sveta", "Shin", 4, List.of(4, 5, 3, 5, 3, 5)),
                new Student("Petr", "Sidorov", 3, List.of(4, 3, 3, 5, 5, 4)),
                new Student("Petr", "Sidorov", 3, List.of(4, 4)));

        /**
         * Part 1
         *
         * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
         * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
         */

        System.out.println("Part1");

        List<Student> filterListStudentForCountMarks = getFilterListStudentForCountMarks(studentList);

        Map<Integer, List<OptionalDouble>> resultListStudents = getResultListStudents(filterListStudentForCountMarks);

        System.out.println(resultListStudents);
        System.out.println();

        /**
         * Part2
         *
         * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
         * Список студентов данного курса, но только с полями Имя и Фамилия.
         * Список должен быть отсортированы по этим двум полям
         */

        System.out.println("Part2");
        List<Student> sortedStudentListForName = getStudentListForName(studentList);
        Map<Integer, List<String>> resultFullNameListSortedName = getResultFullNameListSortedName(sortedStudentListForName);
        printResult(resultFullNameListSortedName);
        System.out.println();


        /**
         * Part3
         *
         * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
         * Объект с двумя полями:
         * - Отсортированный список студентов с пункта 2
         * - Средняя оценка этих студентов
         */

        System.out.println("Part3");
        Map<Integer, List<String>> resultFullNameAndAverageMarksListSortedName = getResultFullNameAndAverageMarksListSortedName(sortedStudentListForName);
        printResult(resultFullNameAndAverageMarksListSortedName);
        System.out.println();

    }

    private static void printResult(Map<Integer, List<String>> resultFullNameListSortedName) {
        for (Map.Entry<Integer, List<String>> integerListEntry : resultFullNameListSortedName.entrySet()) {
            System.out.println(integerListEntry.getKey() + " курс  " + " инфо о студенте (-ах) " + integerListEntry.getValue());
        }
    }

    private static List<Student> getStudentListForName(List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.toList());
    }

    private static Map<Integer, List<String>> getResultFullNameListSortedName(List<Student> sortedStudentListForName) {
        return sortedStudentListForName.stream().collect(groupingBy(Student::getCourse,
                mapping(Student::getFullName, Collectors.toList())));
    }

    private static Map<Integer, List<String>> getResultFullNameAndAverageMarksListSortedName(List<Student> sortedStudentListForName) {
        return sortedStudentListForName.stream().collect(groupingBy(Student::getCourse,
                mapping(Student::getFullNameAndAverageMarks, Collectors.toList())));
    }

    private static Map<Integer, List<OptionalDouble>> getResultListStudents(List<Student> filterListStudentForCountMarks) {
        return filterListStudentForCountMarks.stream()
                .collect(groupingBy(Student::getCourse, mapping(Student::getAverageMarks, Collectors.toList())));
    }

    private static List<Student> getFilterListStudentForCountMarks(List<Student> studentList) {
        return studentList.stream()
                .filter(student -> student.getMarks().size() > 3).toList();
    }

}
