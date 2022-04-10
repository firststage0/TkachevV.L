package com.company;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        int[][] gt = new int[4][4];
        for(int i = 0; i < gt.length; i++){
            for(int j = 0; j < gt.length; j++){
                gt[i][j] = (int) (Math.random()* 200 -101);
            }
        }
        for(int i = 0; i < gt.length; i++){
            for(int j = 0; j < gt.length; j++){
                System.out.print(gt[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}
