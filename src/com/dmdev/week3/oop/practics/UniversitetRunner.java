package com.dmdev.week3.oop.practics;

public class UniversitetRunner {

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov");
        Student[] students = new Student[10];
        students[0] = student;
        Fackultet fackultet = new Fackultet(students);

        for (int i = 0; i < fackultet.getStudents().length; i++) {
            System.out.println(i);
        }
    }

}
