package org.montanajr.lab02.zad02zad03.global;

import org.montanajr.lab02.zad02zad03.concrete.profile.*;
import org.montanajr.lab02.zad02zad03.concrete.student.Student;
import org.montanajr.lab02.zad02zad03.object.File;
import org.montanajr.lab02.zad02zad03.object.Profile;

public class ProfileFactory extends AbstractFactory{


    @Override
    public Student getStudent(Student student) {
        return null;
    }

    @Override
    public File getFile(String fileType) {
        return null;
    }

    @Override
    public Profile getProfile(String profileName) {
        if(profileName.equalsIgnoreCase("sieci")){
            return new Network();
        }else if (profileName.equalsIgnoreCase("grafika")){
            return new Graphics();
        }else if (profileName.equalsIgnoreCase("two")){
            return new SoftwareTech();
        }else if (profileName.equalsIgnoreCase("inzynieria")){
            return new SysEngineering();
        } else {
            return new UnderfinedProfile(profileName);
        }

    }
}
