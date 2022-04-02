package com.company;

public class Main {
    public static void main(String[] args) {
        int[] x = {6, 8, 10, 2, 3, 5, 1, 2, 3, 4, 5, 13};
        int min = x[0];
        for (int i = 1; i < 12; i++){
            if(min > x[i]){
                min = x[i];
            }
        }
        System.out.println(min + " = min ");
        for (int i = 0; i < 12; i++){
            x[i] *= min;
            System.out.println(x[i]);
        }
    }
}

/* Найти минимальный элемент в одномерном массиве x. Затем каждый элементв массиве умножить на минимальный элемент.


