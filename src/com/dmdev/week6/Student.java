package com.dmdev.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Student {

    private final String firstName;
    private final String lastName;
    private int course;
    private List<Integer> marks = new ArrayList<>();

    public Student(String firstName, String lastName, int course, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.marks = marks;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public OptionalDouble getAverageMarks() {
        return getMarks().stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFullNameAndAverageMarks() {
        return firstName + " " + lastName + " " + getAverageMarks();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", course=" + course +
               ", marks=" + marks +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, course, marks);
    }


}
