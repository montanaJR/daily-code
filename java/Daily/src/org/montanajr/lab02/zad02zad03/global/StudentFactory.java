package org.montanajr.lab02.zad02zad03.global;

import org.montanajr.lab02.zad02zad03.concrete.student.Student;
import org.montanajr.lab02.zad02zad03.object.File;
import org.montanajr.lab02.zad02zad03.object.Profile;

public class StudentFactory extends AbstractFactory {


    @Override
    public Student getStudent(Student student) {
        return student;
    }

    @Override
    public File getFile(String fileType) {
        return null;
    }

    @Override
    public Profile getProfile(String profileName) {
        return null;
    }
}