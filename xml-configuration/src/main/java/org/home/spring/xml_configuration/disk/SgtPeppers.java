package org.home.spring.xml_configuration.disk;

import javax.annotation.Nonnull;

public class SgtPeppers implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Sgt. Pepper's Lonely Hearts Club Band";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "The Beatles";
    }
}
