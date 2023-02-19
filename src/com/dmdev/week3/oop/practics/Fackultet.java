package com.dmdev.week3.oop.practics;

public class Fackultet {

    private Student[] students;

    public Fackultet(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
