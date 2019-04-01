package org.montanajr.lab05.zad03;

public class DataAccessorUtil implements DataAccessor {
    protected String file;

    @Override
    public void getFile() {

        System.out.println(String.format("Object reading from %s", file));

    }

    public void setFile(String fileFromStorage){
        System.out.println(String.format("Object settlement from %s", fileFromStorage));
    }

    public DataAccessorUtil(String file) {
        this.file = file;
        setFile(file);
    }
}
