package org.montanajr.lab02.zad02.concrete.student;

public class Student implements org.montanajr.lab02.zad02.object.Student{
    private long number;
    private String name;
    private String surname;

    public Student(long number, String name, String surname) {
        this.number = number;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String getStudentData() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}

