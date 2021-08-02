package org.fail.learnjavafromsimpletodifficult.lessons.lesson20_access_modifier;

public enum DogSize {
    VERY_BIG("XS"),
    SMALL("S"),
    AVERAGE("M"),
    BIG("L"),
    VERY_BIG_("Xl");

    private String abbreviation;

    DogSize(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}