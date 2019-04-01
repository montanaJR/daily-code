package org.montanajr.lab05.zad03;

public class DataObjectProxy implements DataAccessor {
    private DataAccessorUtil dataAccessorUtil;
    private String fileEndpoint;

    public DataObjectProxy(String fileEndpoint) {
        this.fileEndpoint = fileEndpoint;
    }

    @Override
    public void getFile() {
        if(dataAccessorUtil == null)
            dataAccessorUtil = new DataAccessorUtil(fileEndpoint);

            dataAccessorUtil.getFile();

    }
}
