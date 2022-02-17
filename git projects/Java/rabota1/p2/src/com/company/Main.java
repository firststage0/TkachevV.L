package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите параметры");
        int N = 0;
        String num_1;
        for (int i = 0; i < 4; i++) {
            num_1 = num.nextLine();
            if (!num_1.equals("")){
                N += 1;
            }
        }
        if (N == 0){
            System.out.println("Вы не передавали параметров");
        } else{
            System.out.println("Вы  передали " + N + " параметра(ов)");
        }

    }
}