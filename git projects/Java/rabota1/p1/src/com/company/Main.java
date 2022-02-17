package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    System.out.println("Введите имя");
    Scanner str = new Scanner(System.in);
    String name = str.nextLine();
    if (name.equals(""))
        {
            System.out.println("Hello world");
        } else {
        System.out.println("Hello " + name);
            }

    }
}
