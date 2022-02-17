package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
    System.out.println("Введите 2 числа");
    String ft, sd;
    int res = 0;
    ft = num.nextLine();
    if (ft.equals("")) {
        System.out.println("Не правильное кол-во значений");
        System.exit(0);
    }
    sd = num.nextLine();
    if (sd.equals("")){System.out.println("Не правильное кол-во значений"); System.exit(0);}

    int first = Integer.parseInt(ft.trim());
    int second = Integer.parseInt(sd.trim());
    res = first + second;
    System.out.println(ft + " + " + sd + " = " + res);
    }
}
