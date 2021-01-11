package com.codecool;

public class Bird implements Flying, Feeding, Speeking {

    private String name;
    private boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    @Override
    public void fly() {
        speak("Csájp, Csájp");
    }

    @Override
    public void feed() {
        speak("What a wonderful worm");
    }
}
