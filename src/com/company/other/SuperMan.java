package com.company.other;

import java.util.Random;

public class SuperMan implements Programer {

    private Random random = new Random();

    @Override
    public void typeLine() {
        System.out.println("My random number is: " + random.nextInt());
    }

    @Override
    public int add(int first, int second) {
        return first + second;
    }
}
