package com.company;

public class Main {

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.name = "Шарик";
        pet.sayMyName();

        HomeCat homeCat = new HomeCat();
        homeCat.name = "Барсик";
        homeCat.sayMyName();
    }
}
