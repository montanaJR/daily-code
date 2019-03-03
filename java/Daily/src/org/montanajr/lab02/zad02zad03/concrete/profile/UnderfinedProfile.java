package org.montanajr.lab02.zad02zad03.concrete.profile;

import org.montanajr.lab02.zad02zad03.object.Profile;

public class UnderfinedProfile implements Profile {
    private final String profile;

    public UnderfinedProfile(String profile) {
        this.profile = profile;
    }


    @Override
    public String getProfileType() {
        return this.profile;
    }
}
