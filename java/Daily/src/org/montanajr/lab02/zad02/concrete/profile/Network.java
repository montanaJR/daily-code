package org.montanajr.lab02.zad02.concrete.profile;

import org.montanajr.lab02.zad02.object.Profile;

public class Network implements Profile{
    private final String profile;

    public Network() {
        this.profile = "Sieci komputerowe";
}
    @Override
    public String getProfileType() {
        return profile;
    }
}