package org.montanajr.lab05.bridge;

public abstract class Flasher {
    protected Device myDevice = null;
    public boolean flashStatus=false;
    public Flasher(Device aDevice){
        myDevice=aDevice;
    }
    public void connectDevice(){
        myDevice.connectDevice();
    }
    public void validateDevice(){
        if(myDevice.validateDevice()){
            System.out.println("urz�dzenie " + myDevice.getType()+" zosta�o zatwierdzone przez system");
            flashStatus=true;
        }else{
            System.out.println("urz�dzenie " + myDevice.getType()+" nie zosta�o zatwierdzone przez system");
        }
    }
    public void initFlashing(){
        System.out.println("urz�dzenie "+ myDevice.getType() +" sygnalizuje gotowo�� poprzez miganie diody");
    }
    public abstract void communicateViaProtocall();
    public abstract void flashDevice();
    public void eject(){
        myDevice.ejectDevice();
    }
}