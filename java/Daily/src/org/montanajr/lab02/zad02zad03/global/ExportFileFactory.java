package org.montanajr.lab02.zad02zad03.global;

import org.montanajr.lab02.zad02zad03.concrete.file.JsonFile;
import org.montanajr.lab02.zad02zad03.concrete.file.TxtFile;
import org.montanajr.lab02.zad02zad03.concrete.student.Student;
import org.montanajr.lab02.zad02zad03.object.File;
import org.montanajr.lab02.zad02zad03.object.Profile;

public class ExportFileFactory extends AbstractFactory{


    @Override
    public Student getStudent(Student student) {
        return null;
    }

    @Override
    public File getFile(String fileType) {
        if(fileType.equalsIgnoreCase("txt")){
            return new TxtFile();
        } else if (fileType.equalsIgnoreCase("json")){
            return new JsonFile();
        } else {
            throw new IllegalArgumentException("Rodzaj pliku nie jest obsługiwany");
        }
    }

    @Override
    public Profile getProfile(String profileName) {
        return null;
    }
}
