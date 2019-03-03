package org.montanajr.lab02.zad02zad03;

import org.montanajr.lab02.zad02zad03.concrete.student.Student;
import org.montanajr.lab02.zad02zad03.global.AbstractFactory;
import org.montanajr.lab02.zad02zad03.global.FactoryCreator;
import org.montanajr.lab02.zad02zad03.object.File;
import org.montanajr.lab02.zad02zad03.object.Profile;

public class FactoryMain {
    public static void main(String[] args) {
    String fileName = "TXT";
    String profileTxt = "IT Security";
    Student s = new Student(1, "Olek", "V");

        AbstractFactory fileFactory = FactoryCreator.getFactory("file");
        File file = fileFactory.getFile(fileName);

        AbstractFactory profileFactory = FactoryCreator.getFactory("profile");
        Profile profile = profileFactory.getProfile(profileTxt);

        AbstractFactory studentFactory = FactoryCreator.getFactory("student");
        org.montanajr.lab02.zad02zad03.object.Student student = studentFactory.getStudent(s);

        System.out.println(profile.getProfileType());
        System.out.println(student.getStudentData());
        System.out.println(file.getFileType());



    }
}
