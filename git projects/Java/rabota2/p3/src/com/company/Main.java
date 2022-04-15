package com.company;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector vector = new Vector();
        int sum = 0;
        int[][] gt = new int[4][4];
        for(int i = 0; i < gt.length; i++){
            for(int j = 0; j < gt.length; j++){
                gt[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
        for(int i = 0; i < gt.length; i++){
            for(int j = 0; j < gt.length; j++){
                System.out.print(gt[j][i] + "   ");
            }
            System.out.println();
        }
        for(int i = 0; i < gt.length; i++){
            for(int j = 0; j < gt.length; j++){
                if (gt[i][j] < 0){
                    sum += gt[i][j];
                }
            }
            vector.add(sum);
            sum = 0;
        }
        System.out.println(vector);
    }
}

/*
Определить марицу, заполнить ее случайными значениями. Построить вектор, который будет возвращать сумму отрцательных
элементов в каждом столбце
 */