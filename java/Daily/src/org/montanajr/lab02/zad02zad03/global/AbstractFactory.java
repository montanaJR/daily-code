package org.montanajr.lab02.zad02zad03.global;

import org.montanajr.lab02.zad02zad03.concrete.student.Student;
import org.montanajr.lab02.zad02zad03.object.File;
import org.montanajr.lab02.zad02zad03.object.Profile;

public abstract class AbstractFactory {

    public abstract Student getStudent(Student student);
    public abstract File getFile(String fileType);
    public abstract Profile getProfile (String profileName);
}
