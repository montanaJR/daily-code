package org.montanajr.lab02.zad02zad03.concrete.file;

import org.montanajr.lab02.zad02zad03.object.File;

public class JsonFile implements File {

    private final String fileName;

    public JsonFile() {
        this.fileName = "json";
    }

    @Override
    public String getFileType() {
        return fileName;
    }
}
