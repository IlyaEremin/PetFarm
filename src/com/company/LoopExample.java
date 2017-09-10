package com.company;

public class LoopExample {

    public static void main(String[] args) {
        int[] array = {2, 10, 20, 0, 2, 240};
        int average = average(array);
        System.out.println("Среднее число: " + average);
    }

    public static int average(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += inputArray[i];
        }
        return sum / 6;
    }
}
