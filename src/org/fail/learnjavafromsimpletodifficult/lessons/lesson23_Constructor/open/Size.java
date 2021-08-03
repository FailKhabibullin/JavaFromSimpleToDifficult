package org.fail.learnjavafromsimpletodifficult.lessons.lesson23_Constructor.open;

public enum Size {
    VERY_SMALL("XS"),
    SMALL("S"),
    AVERAGE("M"),
    BIG("L"),
    VERY_BIG("Xl"),
    UNDEFINED("Undef");

    private String abbreviation;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}