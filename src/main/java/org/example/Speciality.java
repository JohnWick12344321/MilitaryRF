package org.example;

public enum Speciality {
    TANKIST("113"),
    SNIPER("109"),
    Svyazist("121"),
    Voditel ("124 "),
    TEXNIK("262");

    String speciality;

    Speciality(String speciality) {
        this.speciality = speciality;
    }
}