package org.montanajr.lab05.bridge;

public class USBDevice extends Device
{
    public USBDevice(){
        type="USB";
        deviceConnectionStatus=true;
    }
    public boolean validateDevice() {
        System.out.println("system zatwierdzi� urz�dzenie portu USB");
        return true;
    }
}