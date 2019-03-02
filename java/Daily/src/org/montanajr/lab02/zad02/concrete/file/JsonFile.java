package org.montanajr.lab02.zad02.concrete.file;

import org.montanajr.lab02.zad02.object.File;

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
