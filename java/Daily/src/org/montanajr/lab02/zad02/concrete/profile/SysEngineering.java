package org.montanajr.lab02.zad02.concrete.profile;

import org.montanajr.lab02.zad02.object.Profile;

public class SysEngineering implements Profile {

    private final String profile;

    public SysEngineering() {
        this.profile = "Inzynieria systemow informatycznych";
    }

    @Override
    public String getProfileType() {
        return profile;
    }
}
