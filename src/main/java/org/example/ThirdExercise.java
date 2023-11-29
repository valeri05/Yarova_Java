package org.example;

public class ThirdExercise {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int correctArr = 0;
        for (int i : arr) {
            if (i % 3 == 0) {
                correctArr++;
            }
        }
        System.out.print(correctArr);
    }
}