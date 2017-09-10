package com.company;

class HomeCat extends Pet {
    @Override
    public void sayMyName() {

        System.out.println("Мяу, мяу");
    }

    void sayMyweight(){
      System.out.println(weight + name);
    }
}

