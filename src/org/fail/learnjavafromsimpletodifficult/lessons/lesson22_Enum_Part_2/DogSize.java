package org.fail.learnjavafromsimpletodifficult.lessons.lesson22_Enum_Part_2;

public enum DogSize {
    VERY_SMALL("XS"),
    SMALL("S"),
    AVERAGE("M"),
    BIG("L"),
    VERY_BIG("Xl"),
    UNDEFINED("Undef");

    private String abbreviation;

    DogSize(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}