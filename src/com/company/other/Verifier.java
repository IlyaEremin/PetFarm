package com.company.other;

public class Verifier {

    public static void main(String[] args) {
        SuperMan man = new SuperMan();
        man.typeLine();
        int result = man.add(10, 15);
        System.out.println("result is: " + result);
    }
}
