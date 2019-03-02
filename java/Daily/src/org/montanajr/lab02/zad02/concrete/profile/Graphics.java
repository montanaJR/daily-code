package org.montanajr.lab02.zad02.concrete.profile;

import org.montanajr.lab02.zad02.object.Profile;

public class Graphics implements Profile {

    private final String profile;

    public Graphics() {
        this.profile = "Grafika komputerowa";
    }

    @Override
    public String getProfileType() {
        return profile;
    }
}
