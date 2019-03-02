package org.montanajr.lab02.zad02.concrete.file;

import org.montanajr.lab02.zad02.object.File;

public class TxtFile implements File{

    private final String fileType ;

    public TxtFile() {
        this.fileType = "txt";
    }

    @Override
    public String getFileType() {
        return fileType;
    }
}
