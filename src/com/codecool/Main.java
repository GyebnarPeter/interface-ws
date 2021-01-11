package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flying> animals = new ArrayList<>();
            animals.add(new Bird("Bird1", true));
            animals.add(new Bird("Bird2", false));
            animals.add(new LadyBird("LadyBird1", true));
            animals.add(new LadyBird("LadyBird2", false));

        animals.forEach(Flying::fly);

    }
}
