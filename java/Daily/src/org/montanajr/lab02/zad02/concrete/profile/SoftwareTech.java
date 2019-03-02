package org.montanajr.lab02.zad02.concrete.profile;

import org.montanajr.lab02.zad02.object.Profile;

public class SoftwareTech  implements Profile {
    private final String profile;

    public SoftwareTech() {
        this.profile = "Technologie wytwarzania oprogramowania";
    }

    @Override
    public String getProfileType() {
        return profile;
    }
}
