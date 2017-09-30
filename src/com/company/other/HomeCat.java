package com.company.other;

class HomeCat extends Pet {
    @Override
    public void sayMyName() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Мяу");
        }
    }

    void sayMyweight() {
        System.out.println(weight + name);
    }
}

